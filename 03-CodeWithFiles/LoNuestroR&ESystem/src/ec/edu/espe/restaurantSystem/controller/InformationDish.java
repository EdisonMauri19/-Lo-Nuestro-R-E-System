
package ec.edu.espe.restaurantSystem.controller;

import ec.edu.espe.restaurantSystem.model.Dish;


public class InformationDish {
     public void showInformation(){
         Dish dishInf = new Dish();
         
        System.out.println("\n\tPlato N: "+this.id);
        System.out.println("Nombre: "+this.nameDish);
        System.out.println("Precio: "+this.price);
    }
}
