/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import ec.edu.espe.restaurantSystem.model.Drink;
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
public class DrinkManagerTest {
    
    public DrinkManagerTest() {
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
     * Test of addDrink method, of class DrinkManager.
     */
    @Test
    public void testAddDrink() {
        System.out.println("addDrink");
        Drink drink = null;
        DrinkManager.addDrink(drink);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDrinks method, of class DrinkManager.
     */
    @Test
    public void testReadDrinks() {
        System.out.println("readDrinks");
        ArrayList<Drink> expResult = null;
        ArrayList<Drink> result = DrinkManager.readDrinks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchDrink method, of class DrinkManager.
     */
    @Test
    public void testSearchDrink() {
        System.out.println("searchDrink");
        int id = 2;
        Product expResult = null;
        Product result = DrinkManager.searchDrink(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upgradeDrink method, of class DrinkManager.
     */
    @Test
    public void testUpgradeDrink() {
        System.out.println("upgradeDrink");
        Drink drink = null;
        DrinkManager.upgradeDrink(drink);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
