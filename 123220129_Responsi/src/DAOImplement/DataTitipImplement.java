/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.DataTitip;

/**
 *
 * @author PC PRAKTIKUM
 */
public interface DataTitipImplement {
    public void insert(DataTitip dt);
    public void update(DataTitip dt);
    public void delete(int id);
    public List<DataTitip>getAll();
    
}


