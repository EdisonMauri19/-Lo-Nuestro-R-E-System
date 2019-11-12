
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;
import java.util.Date;


public class Event {
    private int id;
    private int time;
    private Date date;
    private String typeEvent;
    private ArrayList<Dish> menu;
    private int guests;
    private int extraService;
    
    
    public float calculatePrice(){
        float total = 0;
        return total;
    }
    public boolean checkAvailability(){
        return true;
    }
    
}
