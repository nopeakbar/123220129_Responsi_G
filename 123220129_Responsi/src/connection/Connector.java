/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class Connector {
    static Connection con;
    
    public static Connection connection(){
        if(con==null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("responsi_g");
            data.setUser("root");
            data.setDatabaseName("");
            try{
                con = data.getConnection();
                System.out.println("Connection Berhasil");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Connection Gagal");
            }
            
        }
        return con;
    }
}



