/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import ec.edu.espe.restaurantSystem.model.Order;
import ec.edu.espe.restaurantSystem.model.Product;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camyt
 */
public class OrderManagerTest {
    
    public OrderManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of dataEntry method, of class OrderManager.
     */
    @Test
    public void testDataEntry() {
        System.out.println("dataEntry");
        OrderManager instance = new OrderManager();
        Order expResult = null;
        Order result = instance.dataEntry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrder method, of class OrderManager.
     */
    @Test
    public void testAddOrder() {
        System.out.println("addOrder");
        Order newOrder = null;
        OrderManager instance = new OrderManager();
        instance.addOrder(newOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readOrders method, of class OrderManager.
     */
    @Test
    public void testReadOrders() {
        System.out.println("readOrders");
        OrderManager instance = new OrderManager();
        ArrayList<Order> expResult = null;
        ArrayList<Order> result = instance.readOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchOrder method, of class OrderManager.
     */
    @Test
    public void testSearchOrder() {
        System.out.println("searchOrder");
        int id = 0;
        OrderManager instance = new OrderManager();
        Order expResult = null;
        Order result = instance.searchOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgradeOrder method, of class OrderManager.
     */
    @Test
    public void testUpgradeOrder() {
        System.out.println("upgradeOrder");
        ArrayList<Order> arrOrder = null;
        OrderManager instance = new OrderManager();
        instance.upgradeOrder(arrOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dishesOrder method, of class OrderManager.
     */
    @Test
    public void testDishesOrder() {
        System.out.println("dishesOrder");
        OrderManager instance = new OrderManager();
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = instance.dishesOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
