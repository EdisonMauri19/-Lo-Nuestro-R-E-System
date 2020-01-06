/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.Dish;
import ec.edu.espe.restaurantSystem.model.Product;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DishManager {
    private static Gson gson = new Gson();
   
    
    public static void addDish(Dish newDish)
    {
        FileLibrary.addToFile(newDish);
    }
    
    public static ArrayList<Dish> readDishes(){
        ArrayList<Dish> dishes = new ArrayList<>();
        ArrayList<Object> object;
        object = FileLibrary.readObjects(Dish.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            Dish dish;
            Object objectJ;
            objectJ = object.get(i);
            String jDish = gson.toJson(objectJ);
            dish = gson.fromJson(jDish, Dish.class);
            dishes.add(dish);
            
        }
        
        return dishes;
    }
    
    public static Product searchDish(int id){
        ArrayList<Dish> dishes = new ArrayList<>();
        Dish dish = null;
        dishes = readDishes();
        for (int i = 0; i < dishes.size(); i++) {
            if (dishes.get(i).getId() == id) {
                dish =  dishes.get(i);
            }
        }
        return dish;
    }
    
    public static void upgradeDish(Dish dish){
        ArrayList<Dish> dishes;
        dishes = DishManager.readDishes();
        int index = dish.getId()-1;
        dishes.get(index).setName(dish.getName());
        dishes.get(index).setPrice(dish.getPrice());
        dishes.get(index).setType(dish.getType());
        File f=new File("Dish.json");
        f.delete();
        for (int i = 0; i < dishes.size(); i++) {
            addDish(dishes.get(i));
        }
    }
}
