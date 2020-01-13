/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.Extra;

import ec.edu.espe.restaurantSystem.model.Product;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class ExtraManager {
     static Gson gson = new Gson();
    public static void addExtra(Extra extra){
        FileLibrary.addToFile(extra);
    }
    
    public static ArrayList<Extra> readExtra(){
        ArrayList<Extra> extras = new ArrayList<>();
        ArrayList<Object> object;
        object = FileLibrary.readObjects(Extra.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            Extra extra;
            Object objectJ;
            objectJ = object.get(i);
            String jExtra = gson.toJson(objectJ);
            extra = gson.fromJson(jExtra, Extra.class);
            extras.add(extra);
            
        }
        
        return extras;
    }
    public static Product searchExtra(int id){
        ArrayList<Extra> extras = new ArrayList<>();
        Extra extra = null;
        extras = readExtra();
        for (int i = 0; i < extras.size(); i++) {
            if (extras.get(i).getId() == id) {
                extra =  extras.get(i);
            }
        }
        return extra;
    }
    
    public static void upgradeExtra(Extra extra){
        ArrayList<Extra> extras;
        extras = readExtra();
        int index = extra.getId()-1;
        extras.get(index).setName(extra.getName());
        extras.get(index).setPrice(extra.getPrice());
        
        File file=new File("Extra.json");
        file.delete();
        for (int i = 0; i < extras.size(); i++) {
            addExtra(extras.get(i));
        }
    }
}

