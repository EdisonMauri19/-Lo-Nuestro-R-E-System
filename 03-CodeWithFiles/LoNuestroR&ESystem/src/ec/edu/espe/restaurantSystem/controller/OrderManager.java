/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;
import ec.edu.espe.restaurantSystem.model.Product;
import ec.edu.espe.restaurantSystem.model.Order;
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
public class OrderManager {
    public Order dataEntry(){
        Scanner scn = new Scanner(System.in);
        Order order = new Order();
        ArrayList<Product> arrDish = new ArrayList<Product>();
        try{
            
            System.out.println("Codigo Orden : ");
            order.setId(Integer.parseInt(scn.nextLine()));
            System.out.println("\n\tDatos Del Pedido");
            System.out.println("Nombre : ");
            order.setName(scn.nextLine()); 
            System.out.println("C.I : ");
            order.setDni(scn.nextLine());
            System.out.println("Direccion");
            order.setAddress(scn.nextLine());
            System.out.println("\nPlatos: ");
            arrDish = dishesOrder();
            order.setDishList(arrDish);
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
        return order;
    }
    
    public void addOrder(Order newOrder)
    {
        try
        {
            File f=new File("Order.csv");
            FileWriter fw;
            BufferedWriter bw;           
            if(f.exists())
            {
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(newOrder.getId()+";"+newOrder.getName()+";"+newOrder.getDni()+";"+newOrder.getAddress()+";");
                for (int i = 0; i < newOrder.getDishList().size(); i++) {
                    bw.write(newOrder.getDishList().get(i).getId()+";");
                }
                bw.write(Float.toString(newOrder.getPriceOrder()));
                
            }
            else{
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.write(newOrder.getId()+";"+newOrder.getName()+";"+newOrder.getDni()+";"+newOrder.getAddress()+";");
                for (int i = 0; i < newOrder.getDishList().size(); i++) {
                    bw.write(newOrder.getDishList().get(i).getId()+";");
                }
                bw.write(Float.toString(newOrder.getPriceOrder()));
            }
            bw.close();
            
        }catch(IOException e){
            
        }
    }
    
    public ArrayList<Order> readOrders(){
        ArrayList<Order> arrOrder = new ArrayList<Order>();
        DishManager dishM = new DishManager();
        try{
            File f=new File("Order.csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Order order = new Order();
                    String[] contact = line.split(";");
                    
                    order.setId(Integer.parseInt(contact[0]));
                    order.setName(contact[1]);
                    order.setDni(contact[2]);
                    order.setAddress(contact[3]);
                    ArrayList<Product> arrDish = new ArrayList<Product>();
                    for (int i = 4; i < contact.length-1; i++) {
                        Product dish = null;
                        int id = Integer.parseInt(contact[i]);
                        dish = dishM.searchDish(id);
                        arrDish.add(dish);
                    }
                    order.setDishList(arrDish);
                    arrOrder.add(order);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return arrOrder;
    }
    
    public Order searchOrder(int id){
        ArrayList<Order> arrOrder = new ArrayList<Order>();
        Order order = new Order();
        arrOrder = readOrders();
        for (int i = 0; i < arrOrder.size(); i++) {
            if (arrOrder.get(i).getId() == id) {
                order =  arrOrder.get(i);
            }
        }
        return order;
    }
    
    public void upgradeOrder(ArrayList<Order> arrOrder){
        File f=new File("Order.csv");
        f.delete();
        for (int i = 0; i < arrOrder.size(); i++) {
            addOrder(arrOrder.get(i));
        }
    }
    
    public ArrayList<Product> dishesOrder(){
        Scanner scn = new Scanner(System.in);
        ArrayList<Product> arrDish = new ArrayList<Product>();
        DishManager dishM = new DishManager();
        
        try{ 
            int option;
            do{
                System.out.println("Inserte codigo de plato : ");
                int id = (Integer.parseInt(scn.nextLine()));
                Product dish = null;
                dish = dishM.searchDish(id);
                arrDish.add(dish);
                System.out.println("Añadir otro plato?   1. Si     2. No");
                option = scn.nextInt();
                scn.nextLine();
            }while(option != 2);
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
        return arrDish;
    }
}
