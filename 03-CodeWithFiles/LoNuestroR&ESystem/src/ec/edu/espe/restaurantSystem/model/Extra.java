/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import ec.edu.espe.restaurantSystem.controller.DishManager;
import ec.edu.espe.restaurantSystem.controller.ExtraManager;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camyt
 */
public class Extra extends Product {
    private String type;

    public Extra() {
    }
    
    public Extra(String type, int id, String name, float price) {
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
        ArrayList<Extra> extra;
        File f = new File("Extra.json");
        if(f.exists())
        {
            extra = ExtraManager.readExtra();
            return extra.size()+1;
        }else return 1;
    }

    @Override
    public void showProducts(JTable table, String type) {
        DefaultTableModel modeloT = new DefaultTableModel();
        ArrayList<Extra> extras;
        extras = ExtraManager.readExtra();
        
        table.setModel(modeloT);
        modeloT.addColumn("Número");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Precio");
        Object [] columna = new Object[3];
        
            for (int i = 0; i < extras.size(); i++) {
                Extra extra = extras.get(i);
                if(extra.getType().equals(type))
                {
                    columna[0]= extra.getId();
                    columna[1]= extra.getName();
                    columna[2] = extra.getPrice()+ "$";
                }
                modeloT.addRow(columna);
            }
    }
    
    
}

