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
    
    Courier instance;
    
    public void setUp(){
        instance = new Courier();
    }

    /**
     * Test of setName method, of class Courier.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Peter Venkman";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }
    
    /**
     * Test of setName method, of class Courier.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithSurOrForenameOnly() {
        System.out.println("testSetNameOnlySurOrForname");
        String name = "Rocket";
        instance.setName(name);
    }
    
    /**
     * Test of setName method, of class Courier.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithLowerCaseForename() {
        System.out.println("testSetNameWithLowerCaseForename");
        String name = "raymond Stanz";
        instance.setName(name);
    }
    
    /**
     * Test of setName method, of class Courier.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithLowerCaseSurname() {
        System.out.println("testSetNameWithLowerCaseSurname");
        String name = "Egon spengler";
        instance.setName(name);
    }
    
    /**
     * Test of setName method, of class Courier.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithCamelCaseSurname() {
        System.out.println("testSetNameWithCamelCaseSurname");
        String name = "Max MusterMann";
        instance.setName(name);
    }
    
    /**
     * Test of setName method, of class Courier.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNameWithCamelCaseForename() {
        System.out.println("testSetNameWithCamelCaseForename");
        String name = "LeVar Burton";  // Sorry, no Stagenames allowed.
        instance.setName(name);
    }
}
