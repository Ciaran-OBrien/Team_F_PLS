/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jan
 */
public class CourierTest {
    
    public CourierTest() {
    }

    /**
     * Test of setName method, of class Courier.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Courier instance = new Courier();
        instance.setName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Courier.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Courier instance = new Courier();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddres method, of class Courier.
     */
    @Test
    public void testSetAddres() {
        System.out.println("setAddres");
        Courier instance = new Courier();
        instance.setAddres();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Courier.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Courier instance = new Courier();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
