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

    Order order;
    
    @Before
    public void setUp(){
        // order = new Order(...);  //TODO
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
}
