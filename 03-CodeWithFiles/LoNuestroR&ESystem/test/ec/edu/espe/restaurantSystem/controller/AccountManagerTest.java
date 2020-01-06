/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import ec.edu.espe.restaurantSystem.model.Account;
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
public class AccountManagerTest {
    
    public AccountManagerTest() {
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
     * Test of addAccount method, of class AccountManager.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account account = null;
        AccountManager.addAccount(account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAccount method, of class AccountManager.
     */
    @Test
    public void testReadAccount() {
        System.out.println("readAccount");
        ArrayList<Account> expResult = null;
        ArrayList<Account> result = AccountManager.readAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valAccount method, of class AccountManager.
     */
    @Test
    public void testValAccount() {
        System.out.println("valAccount");
        String userName = "camila";
        String password = "camila";
        Account expResult = null;
        Account result = AccountManager.valAccount(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valNewAccount method, of class AccountManager.
     */
    @Test
    public void testValNewAccount() {
        System.out.println("valNewAccount");
        String userName = "camila";
        String password = "camila";
        Account expResult = null;
        Account result = AccountManager.valNewAccount(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assingId method, of class AccountManager.
     */
    @Test
    public void testAssingId() {
        System.out.println("assingId");
        int expResult = 0;
        int result = AccountManager.assingId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
