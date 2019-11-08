package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.model.Dish;
import ec.edu.espe.restaurantSystem.model.DishManager;
import ec.edu.espe.restaurantSystem.model.Order;
import ec.edu.espe.restaurantSystem.model.OrderManager;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RestaurantManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DishManager dishM = new DishManager();
        OrderManager orderM = new OrderManager();
        boolean exit = false;
        int option;
        while(!exit){
            System.out.println("\n\t Lo Nuestro R&E System\n");
            System.out.println("1| Ingresar Plato");
            System.out.println("2| Mostrar Platos");
            System.out.println("3| Nueva Orden");
            System.out.println("4| Mostrar Ordenes");
            System.out.println("5| Salir");

            System.out.println("\nDigite una opcion: ");
            option = scn.nextInt();

            switch(option){
                case 1:
                    Dish newDish = new Dish();
                    newDish = dishM.dataEntry();
                    dishM.addDish(newDish);
                    break;
                case 2:
                    ArrayList<Dish> arrDish = new ArrayList<Dish>();
                    arrDish = dishM.readDishes();
                    for (Dish dish: arrDish){
                        dish.showInformation();
                    }
                    break;
                 case 3:
                    Order newOrder = new Order();
                    newOrder = orderM.dataEntry();
                    orderM.addOrder(newOrder);
                    break;
                 case 4:
                    ArrayList<Order> arrOrder = new ArrayList<Order>();
                    arrOrder = orderM.readOrders();
                    for (Order order: arrOrder){
                        order.showInformation();
                    }
                    break;
                 case 5:
                    exit = true;
                    break;
                 default:
                    System.out.println("Digite una opcion valida");
            }
        }
        
        
    }
    
}
