
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;
import java.util.Date;


public class Event {
    private int id;
    private int time;
    private Date date;
    private String typeEvent;
    private ArrayList<ExtraService> services;
    private Order menu;
    private int guests;
    private int extraService;

    

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

    public ArrayList<ExtraService> getMenu() {
        return services;
    }

    public void setMenu(ArrayList<ExtraService> menu) {
        this.services = menu;
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
