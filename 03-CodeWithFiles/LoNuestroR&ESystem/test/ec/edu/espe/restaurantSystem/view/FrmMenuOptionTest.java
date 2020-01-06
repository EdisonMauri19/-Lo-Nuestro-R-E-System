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
public class FrmMenuOptionTest {
    
    public FrmMenuOptionTest() {
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
     * Test of main method, of class FrmMenuOption.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FrmMenuOption.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class FrmMenuOption.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        FrmMenuOption instance = new FrmMenuOption();
        Account expResult = null;
        Account result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class FrmMenuOption.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Account user = null;
        FrmMenuOption instance = new FrmMenuOption();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
