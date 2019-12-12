/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import ec.edu.espe.restaurantSystem.controller.DrinkManager;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class Drink extends Product{
    private int quantity;

    public Drink() {
    }

    public Drink(int quantity, int id, String name, float price) {
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
        ArrayList<Drink> drinks;
        File f = new File("Drink.json");
        if (f.exists()) {
            drinks = DrinkManager.readDrinks();
            return drinks.size()+1;
        }else return 1;
    }
    
}
