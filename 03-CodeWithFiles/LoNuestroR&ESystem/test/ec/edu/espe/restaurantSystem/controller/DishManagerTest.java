/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import ec.edu.espe.restaurantSystem.model.Dish;
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
public class DishManagerTest {
    
    public DishManagerTest() {
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
     * Test of addDish method, of class DishManager.
     */
    @Test
    public void testAddDish() {
        System.out.println("addDish");
        Dish newDish = null;
        DishManager.addDish(newDish);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDishes method, of class DishManager.
     */
    @Test
    public void testReadDishes() {
        System.out.println("readDishes");
        ArrayList<Dish> expResult = null;
        ArrayList<Dish> result = DishManager.readDishes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchDish method, of class DishManager.
     */
    @Test
    public void testSearchDish() {
        System.out.println("searchDish");
        int id = 0;
        Product expResult = null;
        Product result = DishManager.searchDish(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgradeDish method, of class DishManager.
     */
    @Test
    public void testUpgradeDish() {
        System.out.println("upgradeDish");
        Dish dish = null;
        DishManager.upgradeDish(dish);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
