/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.lib;

import ec.edu.espe.restaurantSystem.model.Dish;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FileLibrary {
    public static void addToFile(Object objeto) {
         try
        {
            File f=new File(objeto.getClass().getSimpleName()+".csv");
            FileWriter fw;
            BufferedWriter bw;           
            if(f.exists())
            {
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(objeto.toString());
                
            }
            else{
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.write(objeto.toString());
            }
            bw.close();
            
        }catch(IOException e){
            
        }
    }
     
    public ArrayList<Object> readDishes(Object object){
        ArrayList<Object> objects = new ArrayList<>();
        try{
            File f=new File(object.getClass().getSimpleName()+".csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Object[] contact = line.split(";");
                    Object newObject;
                    
                    newObject = new Object();
                    newObject.getClass().
                    dish.setId(Integer.parseInt(contact[0]));
                    dish.setName(contact[1]);
                    dish.setPrice(Float.parseFloat(contact[2]));
            
                    arrDish.add(dish);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return arrDish;
    }
}
