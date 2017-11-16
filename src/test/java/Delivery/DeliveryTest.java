/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jan
 */
public class DeliveryTest {
    
    public DeliveryTest() {
    }

    /**
     * Test of getID method, of class Delivery.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Delivery instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Delivery.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int DelivertId = 0;
        Delivery instance = null;
        instance.setID(DelivertId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Delivery.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Delivery instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Delivery.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String dateformat = "";
        Delivery instance = null;
        instance.setDate(dateformat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Delivery.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Delivery instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
