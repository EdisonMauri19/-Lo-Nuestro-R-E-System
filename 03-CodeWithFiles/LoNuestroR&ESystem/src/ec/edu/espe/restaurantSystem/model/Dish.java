/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import ec.edu.espe.restaurantSystem.controller.DishManager;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class Dish extends Product {
    private String type;

    public Dish() {
    }
    
    public Dish(String type, int id, String name, float price) {
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
        ArrayList<Dish> dishes;
        File f = new File("Dish.json");
        if(f.exists())
        {
            dishes = DishManager.readDishes();
            return dishes.size()+1;
        }else return 1;
    }
    
    
}
