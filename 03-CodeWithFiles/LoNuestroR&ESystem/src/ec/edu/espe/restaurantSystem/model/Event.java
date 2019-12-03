
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;
import java.util.Date;


public class Event {
    private int id;
    private int time;
    private Date date;
    private String typeEvent;
    private ArrayList<Product> menu;
    private int guests;
    private int extraService;

    public Event(int id, int time, Date date, String typeEvent, ArrayList<Product> menu, int guests, int extraService) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.typeEvent = typeEvent;
        this.menu = menu;
        this.guests = guests;
        this.extraService = extraService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(String typeEvent) {
        this.typeEvent = typeEvent;
    }

    public ArrayList<Product> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Product> menu) {
        this.menu = menu;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public int getExtraService() {
        return extraService;
    }

    public void setExtraService(int extraService) {
        this.extraService = extraService;
    }
    
    
    
}
