/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;


import ec.edu.espe.restaurantSystem.controller.DessertManage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author camyt
 */
public class Dessert extends Product{
    private int quantity;

    public Dessert() {
    }

    public Dessert(int quantity, int id, String name, float price) {
        super(id, name, price);
        this.quantity = quantity;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int assingId() {
        ArrayList<Dessert> dessert;
        File f = new File("Dessert.json");
        if (f.exists()) {
            dessert = DessertManage.readDessert();
            return dessert.size()+1;
        }else return 1;
    }

    @Override
    public void showProducts(JTable table, String type) {
        DefaultTableModel modeloT = new DefaultTableModel();
        ArrayList<Dessert> desserts;
        desserts = DessertManage.readDessert();
        
        table.setModel(modeloT);
        modeloT.addColumn("Número");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Precio");
        Object [] columna = new Object[3];
        
            for (int i = 0; i < desserts.size(); i++) {
                Dessert dessert = desserts.get(i);
                columna[0]= dessert.getId();
                columna[1]= dessert.getName();
                columna[2] = dessert.getPrice()+ "$";
                
                modeloT.addRow(columna);
            }    
    }
    
}

