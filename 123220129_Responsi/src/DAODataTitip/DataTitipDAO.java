/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAODataTitip;

import DAOImplement.DataTitipImplement;
import com.sun.jdi.connect.spi.Connection;
import connection.Connector;
import java.beans.Statement;
import model.DataTitip;


/**
 *
 * @author PC PRAKTIKUM
 */
public class DataTitipDAO implements DataTitipImplement{
    Connection connection;
    
    final String getAllData = "SELECT* from datatitip;";
    final String insertData = "ÏNSERT INTO 'datatitip'('nama_pemilik','nama_hewan','jenis_hewan','nomor_telepon','durasi_titip','total_biaya') VALUES(?, ?, ?, ?, ?, ?);";
    final String updateData = "UPDATE datatitip set nama_pemilik=?, hewan=?, jenis_hewan=?, nomor_telepon=?, durasi_titip=?, total_biaya=? where id=?;";
    final String deleteData = "DELETE from datatitip where id=?;";
    public DataTitipDAO(){
        connection = (Connection) Connector.connection();
    }
    
    @Override
    public void insertData(DataTitip dt){
        PreparedStatement statement = null;
        try{ statement =
                connection.prepareStatement(insertData, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, dt.getNama_pemilik());
        statement.setString(1, dt.getNama_hewan());
        statement.setString(1, dt.getJenis_hewan());
        statement.setString(1, dt.getNomor_telepon());
        statement.setString(1, dt.getDurasi_titip());
        statement.setString(1, dt.getTotal_biaya());
        statement.executeUpdate();
        ResultSet rs =
                statement.getGeneratedKeys();
        while(rs.next()){
            dt.setId(rs.getInt(1));
        }
        } catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
        
                }
    }
    }
