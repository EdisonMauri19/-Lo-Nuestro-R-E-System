/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jerico Ruiz
 */
public class Sale {

    private List<Order> orderSale = new ArrayList<>();
    private List<Event> eventSale = new ArrayList<>();

    public Sale() {

    }

    public Sale(ArrayList<Order> orderSale, ArrayList<Event> eventSale) {
        this.eventSale = eventSale;
        this.orderSale = orderSale;

    }

    @Override
    public String toString() {
        return "Sale{" + "orderSale=" + orderSale + ", eventSale=" + eventSale + '}';
    }

    /**
     * @return the orderSale
     */
    public List<Order> getOrderSale() {
        return orderSale;
    }

    /**
     * @param orderSale the orderSale to set
     */
    public void setOrderSale(List<Order> orderSale) {
        this.orderSale = orderSale;
    }

    /**
     * @return the eventSale
     */
    public List<Event> getEventSale() {
        return eventSale;
    }

    /**
     * @param eventSale the eventSale to set
     */
    public void setEventSale(List<Event> eventSale) {
        this.eventSale = eventSale;
    }

}
