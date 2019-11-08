/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Order {
    private int id;
    private String name;
    private String dni;
    private String address;
    private ArrayList<Dish> dishList;
    private float priceOrder;

    public Order() {
    }

    public Order(int id, String name, String dni, String address, ArrayList<Dish> dishList) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.address = address;
        this.dishList = dishList;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dishList
     */
    public ArrayList<Dish> getDishList() {
        return dishList;
    }

    /**
     * @param dishList the dishList to set
     */
    public void setDishList(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }

    /**
     * @return the priceOrder
     */
    public float getPriceOrder() {
        float count = 0;
        for (int i = 0; i < this.dishList.size(); i++) {
            count = count + this.dishList.get(i).getPrice();
        }
        priceOrder = count;
        
        return priceOrder;
    }

    /**
     * @param priceOrder the priceOrder to set
     */
    public void setPriceOrder(float priceOrder) {
        this.priceOrder = priceOrder;
    }
    
    public void showInformation(){
        System.out.println("\nOrden N :"+ this.id);
        System.out.println("\tDatos del Pedido");
        System.out.println("Nombre   : "+this.name);
        System.out.println("C.I      : "+this.dni);
        System.out.println("Direccion: "+this.address);
        System.out.println("\tPlatos");
        for (int i = 0; i < this.dishList.size(); i++) {
            System.out.println(this.dishList.get(i).getName()+" -----> "+this.dishList.get(i).getPrice()+" $");
        }
        System.out.println("\nTotal: "+this.getPriceOrder()+" $");
    }
    
}
