/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.Drink;
import ec.edu.espe.restaurantSystem.model.Product;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DrinkManager {
    static Gson gson = new Gson();
    public static void addDrink(Drink drink){
        FileLibrary.addToFile(drink);
    }
    
    public static ArrayList<Drink> readDrinks(){
        ArrayList<Drink> drinks = new ArrayList<>();
        ArrayList<Object> object;
        object = FileLibrary.readObjects(Drink.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            Drink drink;
            Object objectJ;
            objectJ = object.get(i);
            String jDrink = gson.toJson(objectJ);
            drink = gson.fromJson(jDrink, Drink.class);
            drinks.add(drink);
            
        }
        
        return drinks;
    }
    public static Product searchDrink(int id){
        ArrayList<Drink> drinks = new ArrayList<>();
        Drink drink = null;
        drinks = readDrinks();
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getId() == id) {
                drink =  drinks.get(i);
            }
        }
        return drink;
    }
    
    public static void upgradeDrink(Drink drink){
        ArrayList<Drink> drinks;
        drinks = readDrinks();
        int index = drink.getId()-1;
        drinks.get(index).setName(drink.getName());
        drinks.get(index).setPrice(drink.getPrice());
        drinks.get(index).setQuantity(drink.getQuantity());
        File file=new File("Drink.json");
        file.delete();
        for (int i = 0; i < drinks.size(); i++) {
            addDrink(drinks.get(i));
        }
    }
}
