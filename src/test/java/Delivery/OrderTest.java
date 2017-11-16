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
public class OrderTest {
    
    public OrderTest() {
    }

    /**
     * Test of ParceID method, of class Order.
     */
    @Test
    public void testParceID() {
        System.out.println("ParceID");
        Order instance = null;
        int expResult = 0;
        int result = instance.ParceID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParceID method, of class Order.
     */
    @Test
    public void testSetParceID() {
        System.out.println("setParceID");
        int ParcelId = 0;
        Order instance = null;
        instance.setParceID(ParcelId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourierID method, of class Order.
     */
    @Test
    public void testGetCourierID() {
        System.out.println("getCourierID");
        Order instance = null;
        int expResult = 0;
        int result = instance.getCourierID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourierID method, of class Order.
     */
    @Test
    public void testSetCourierID() {
        System.out.println("setCourierID");
        int CourierId = 0;
        Order instance = null;
        instance.setCourierID(CourierId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Order.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Order instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Order.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String Status = "";
        Order instance = null;
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
