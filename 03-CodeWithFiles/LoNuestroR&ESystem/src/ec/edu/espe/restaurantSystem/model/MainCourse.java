/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import ec.edu.espe.restaurantSystem.controller.DishManager;
import ec.edu.espe.restaurantSystem.controller.MainCourseManage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camyt
 */

public class MainCourse extends Product {
    private String type;

    public MainCourse() {
    }
    
    public MainCourse(String type, int id, String name, float price) {
        super(id, name, price);
        this.type = type;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int assingId() {
        ArrayList<MainCourse> mainCourse;
        File f = new File("MainCourse.json");
        if(f.exists())
        {
            mainCourse = MainCourseManage.readMainCourse();
            return mainCourse.size()+1;
        }else return 1;
    }

    @Override
    public void showProducts(JTable table, String type) {
        DefaultTableModel modeloT = new DefaultTableModel();
        ArrayList<MainCourse> mainCourse;
        mainCourse = MainCourseManage.readMainCourse();
        
        table.setModel(modeloT);
        modeloT.addColumn("Número");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Precio");
        Object [] columna = new Object[3];
        
            for (int i = 0; i < mainCourse.size(); i++) {
                MainCourse mainC = mainCourse.get(i);
                if(mainC.getType().equals(type))
                {
                    columna[0]= mainC.getId();
                    columna[1]= mainC.getName();
                    columna[2] = mainC.getPrice()+ "$";
                }
                modeloT.addRow(columna);
            }
    }
  
    
    

}
