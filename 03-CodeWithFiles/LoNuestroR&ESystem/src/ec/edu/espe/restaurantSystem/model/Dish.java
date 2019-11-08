/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dish {
    private int id;
    private String nameDish;
    private float price;

    public Dish() {
    }

    public Dish(int id, String name, float price) {
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
    
   
    
    public void showInformation(){
        System.out.println("\n\tPlato N: "+this.id);
        System.out.println("Nombre: "+this.nameDish);
        System.out.println("Precio: "+this.price);
    }
    
}