/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Order {
    private int id;
    private String name;
    private String dni;
    private String address;
    private List<Product> dishList = new ArrayList<>();
    private float priceOrder;

    public Order() {
    }

    public Order(int id, String name, String dni, String address, ArrayList<Product> dishList) {
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
    public List<Product> getDishList() {
        return dishList;
    }

    /**
     * @param dishList the dishList to set
     */
    public void setDishList(ArrayList<Product> dishList) {
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
    
   

    @Override
    public String toString() {
        return "\nOrden N :"+ id + "\nNombre   : "+name + "\nC.I      : "+dni + "\nDireccion: "+address + "\nPlatos: \n" + Arrays.toString(dishList.toArray()) + "\nTotal:      " + this.getPriceOrder() + "$";
    }
    
} 
