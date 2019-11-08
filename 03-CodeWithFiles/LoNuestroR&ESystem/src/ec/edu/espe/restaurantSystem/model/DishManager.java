/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DishManager {
    public Dish dataEntry(){
        Scanner scn = new Scanner(System.in);
        Dish newDish = new Dish();
        try{
            
            System.out.println("Codigo Plato : ");
            newDish.setId(Integer.parseInt(scn.nextLine()));
            System.out.println("Nombre        : ");
            newDish.setName(scn.nextLine()); 
            System.out.println("Precio       : ");
            newDish.setPrice(Float.parseFloat(scn.nextLine()));
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
        return newDish;
    }
    
    public void addDish(Dish newDish)
    {
        try
        {
            File f=new File("Dish.csv");
            FileWriter fw;
            BufferedWriter bw;           
            if(f.exists())
            {
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(newDish.getId()+";"+newDish.getName()+";"+newDish.getPrice());
                
            }
            else{
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.write(newDish.getId()+";"+newDish.getName()+";"+newDish.getPrice());
            }
            bw.close();
            
        }catch(IOException e){
            
        }
    }
    
    public ArrayList<Dish> readDishes(){
        ArrayList<Dish> arrDish = new ArrayList<Dish>();
        try{
            File f=new File("Dish.csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Dish dish = new Dish();
                    String[] contact = line.split(";");
                    
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
    
    public Dish searchDish(int id){
        ArrayList<Dish> arrDish = new ArrayList<Dish>();
        Dish dish = new Dish();
        arrDish = readDishes();
        for (int i = 0; i < arrDish.size(); i++) {
            if (arrDish.get(i).getId() == id) {
                dish =  arrDish.get(i);
            }
        }
        return dish;
    }
    
    public void upgradeDish(ArrayList<Dish> arrDish){
        File f=new File("Dish.csv");
        f.delete();
        for (int i = 0; i < arrDish.size(); i++) {
            addDish(arrDish.get(i));
        }
    }
}
