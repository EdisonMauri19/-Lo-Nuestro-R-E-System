/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import ec.edu.espe.restaurantSystem.model.Order;


public class InformationOrder {
     public void showInformation(){
         Order orderInf = new Order();
                 
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
