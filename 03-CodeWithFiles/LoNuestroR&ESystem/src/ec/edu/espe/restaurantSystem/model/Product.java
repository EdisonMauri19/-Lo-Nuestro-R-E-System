/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import javax.swing.JTable;


/**
 *
 * @author user
 */
public abstract class Product {
    private int id;
    private String nameDish;
    private float price;
    

    public Product() {
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.nameDish = name;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nameDish
     */
    public String getName() {
        return nameDish;
    }

    /**
     * @param name the nameDish to set
     */
    public void setName(String name) {
        this.nameDish = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
   
    
   
    
    @Override
    public String toString() {
        return id + ";"+nameDish + ";" + price;
    }
    
    public abstract int assingId();
    public abstract void showProducts(JTable table, String type);
    
    
}
