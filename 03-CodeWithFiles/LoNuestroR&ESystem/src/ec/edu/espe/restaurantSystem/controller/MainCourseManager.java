/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

/**
 *
 * @author camyt
 */

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.MainCourse;

import ec.edu.espe.restaurantSystem.model.Product;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MainCourseManager{
    static Gson gson = new Gson();
    public static void addMainCourse(MainCourse mainCourse){
        FileLibrary.addToFile(mainCourse);
    }
    
    public static ArrayList<MainCourse> readMainCourse(){
        ArrayList<MainCourse> mainC = new ArrayList<>();
        ArrayList<Object> object;
        object = FileLibrary.readObjects(MainCourse.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            MainCourse mainCourse;
            Object objectJ;
            objectJ = object.get(i);
            String jMainCourse = gson.toJson(objectJ);
            mainCourse = gson.fromJson(jMainCourse, MainCourse.class);
            mainC.add(mainCourse);
            
        }
        
        return mainC;
    }
    public static Product searchMainCourse(int id){
        ArrayList<MainCourse> mainC = new ArrayList<>();
        MainCourse drink = null;
        mainC = readMainCourse();
        for (int i = 0; i < mainC.size(); i++) {
            if (mainC.get(i).getId() == id) {
                drink =  mainC.get(i);
            }
        }
        return drink;
    }
    
    public static void upgradeDrink(MainCourse mainCourse){
        ArrayList<MainCourse> mainC;
        mainC = readMainCourse();
        int index = mainCourse.getId()-1;
        mainC.get(index).setName(mainCourse.getName());
        mainC.get(index).setPrice(mainCourse.getPrice());
        File f=new File("MainCourse.json");
        f.delete();
        for (int i = 0; i < mainC.size(); i++) {
            addMainCourse(mainC.get(i));
        }
    }
}
