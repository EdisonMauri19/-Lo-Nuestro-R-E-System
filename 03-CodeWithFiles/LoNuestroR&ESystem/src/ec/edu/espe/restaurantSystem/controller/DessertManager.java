/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.Dessert;

import ec.edu.espe.restaurantSystem.model.Product;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class DessertManager {
     static Gson gson = new Gson();
    public static void addDessert(Dessert dessert){
        FileLibrary.addToFile(dessert);
    }
    
    public static ArrayList<Dessert> readDessert(){
        ArrayList<Dessert> desserts = new ArrayList<>();
        ArrayList<Object> object;
        object = FileLibrary.readObjects(Dessert.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            Dessert dessert;
            Object objectJ;
            objectJ = object.get(i);
            String jDessert = gson.toJson(objectJ);
            dessert = gson.fromJson(jDessert, Dessert.class);
            desserts.add(dessert);
            
        }
        
        return desserts;
    }
    public static Product searchDessert(int id){
        ArrayList<Dessert> desserts = new ArrayList<>();
        Dessert dessert = null;
        desserts = readDessert();
        for (int i = 0; i < desserts.size(); i++) {
            if (desserts.get(i).getId() == id) {
                dessert =  desserts.get(i);
            }
        }
        return dessert;
    }
    
    public static void upgradeDrink(Dessert dessert){
        ArrayList<Dessert> desserts;
        desserts = readDessert();
        int index = dessert.getId()-1;
        desserts.get(index).setName(dessert.getName());
        desserts.get(index).setPrice(dessert.getPrice());

        File file=new File("Dessert.json");
        file.delete();
        for (int i = 0; i < desserts.size(); i++) {
            addDessert(desserts.get(i));
        }
    }
}

