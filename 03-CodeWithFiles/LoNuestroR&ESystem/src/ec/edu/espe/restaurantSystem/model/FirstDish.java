/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import ec.edu.espe.restaurantSystem.controller.DishManager;
import ec.edu.espe.restaurantSystem.controller.FirstDishManager;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.Dish;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camyt
 */
public class FirstDish extends Product {
    private String type;

    public FirstDish() {
    }
    
    public FirstDish(String type, int id, String name, float price) {
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
        ArrayList<FirstDish> firstDish;
        File f = new File("FirstDish.json");
        if(f.exists())
        {
            firstDish = FirstDishManager.readFirstDish();
            return firstDish.size()+1;
        }else return 1;
    }

    @Override
    public void showProducts(JTable table, String type) {
        DefaultTableModel modeloT = new DefaultTableModel();
        ArrayList<FirstDish> firstDish;
        firstDish = FirstDishManager.readFirstDish();
        
        table.setModel(modeloT);
        modeloT.addColumn("Número");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Precio");
        Object [] columna = new Object[3];
        
            for (int i = 0; i < firstDish.size(); i++) {
                FirstDish first = firstDish.get(i);
                if(first.getType().equals(type))
                {
                    columna[0]= first.getId();
                    columna[1]= first.getName();
                    columna[2] = first.getPrice()+ "$";
                }
                modeloT.addRow(columna);
            }
    }
  
    
    
}

