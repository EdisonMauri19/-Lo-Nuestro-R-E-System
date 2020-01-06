/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.model.Account;
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
public class FrmDishTest {
    
    public FrmDishTest() {
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
     * Test of backToMenu method, of class FrmDish.
     */
    @Test
    public void testBackToMenu() {
        System.out.println("backToMenu");
        FrmDish instance = new FrmDish();
        instance.backToMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class FrmDish.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        FrmDish instance = new FrmDish();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeDish method, of class FrmDish.
     */
    @Test
    public void testGetTypeDish() {
        System.out.println("getTypeDish");
        FrmDish instance = new FrmDish();
        String expResult = "Entrada";
        String result = instance.getTypeDish();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FrmDish.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmDish.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class FrmDish.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        FrmDish instance = new FrmDish();
        Account expResult = null;
        Account result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class FrmDish.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Account user = null;
        FrmDish instance = new FrmDish();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
