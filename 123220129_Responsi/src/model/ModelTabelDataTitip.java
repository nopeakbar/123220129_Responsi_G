/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author PC PRAKTIKUM
 */
public class ModelTabelDataTitip extends AbstractTableModel {
    
    List<DataTitip> dataTitip;
    String kolom[]={"id", "nama_pemilik", "nama_hewan", "jenis_hewan", "nomor_telepon", "durasi_titip", "total_biaya"};
    private int columnIndex;
    
    public
            ModelTabelDataTitip(List<DataTitip>dataTitip){
                this.dataTitip = dataTitip;
            }

    @Override
    public int getRowCount() {
        return dataTitip.size(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return kolom.length; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getColumnName(int ColumnIndex) {
        return kolom[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
            return
dataTitip.get(rowIndex).getId();
            case 1:
            return
dataTitip.get(rowIndex).getNama_pemilik();
            case 2:
            return
dataTitip.get(rowIndex).getNama_hewan();
            case 3:
            return
dataTitip.get(rowIndex).getJenis_hewan();
            case 4:
            return
dataTitip.get(rowIndex).getNomor_telepon();
            case 5:
            return
dataTitip.get(rowIndex).getDurasi_titip();
            case 6:
            return
dataTitip.get(rowIndex).getTotal_biaya();
        }
        return null;
    }
}
