/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.FirstDish;
import ec.edu.espe.restaurantSystem.model.Product;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class FirstDishManager {
    static Gson gson = new Gson();
    public static void addFirstDish(FirstDish firstDish){
        FileLibrary.addToFile(firstDish);
    }
    
    public static ArrayList<FirstDish> readFirstDish(){
        ArrayList<FirstDish> firstD = new ArrayList<>();
        ArrayList<Object> object;
        object = FileLibrary.readObjects(FirstDish.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            FirstDish firstDish;
            Object objectJ;
            objectJ = object.get(i);
            String jFirstDish = gson.toJson(objectJ);
            firstDish = gson.fromJson(jFirstDish, FirstDish.class);
            firstD.add(firstDish);
            
        }
        
        return firstD;
    }
    public static Product searchFirstDish(int id){
        ArrayList<FirstDish> firstD = new ArrayList<>();
        FirstDish firstDish = null;
        firstD = readFirstDish();
        for (int i = 0; i < firstD.size(); i++) {
            if (firstD.get(i).getId() == id) {
                firstDish =  firstD.get(i);
            }
        }
        return firstDish;
    }
    
    public static void upgradeDrink(FirstDish firstDish){
        ArrayList<FirstDish> firstD;
        firstD = readFirstDish();
        int index = firstDish.getId()-1;
        firstD.get(index).setName(firstDish.getName());
        firstD.get(index).setPrice(firstDish.getPrice());
        File f=new File("FirstDish.json");
        f.delete();
        for (int i = 0; i < firstD.size(); i++) {
            addFirstDish(firstD.get(i));
        }
    }
}

    

