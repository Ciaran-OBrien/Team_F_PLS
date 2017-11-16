/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jan
 */
public class DeliveryTest {

    Delivery instance;

    @Before
    public void setUp() {
        // When implementation is ready:
        // instance = new Delivery(...);
    }

    /**
     * Test of setID method, of class Delivery.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int DelivertId = Integer.MAX_VALUE;
        Delivery instance = null;
        instance.setID(DelivertId);
        assertEquals(DelivertId, instance.getID());
    }

    /**
     * Test of setID method, of class Delivery.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetIDWithNegativeValue() {
        System.out.println("setID");
        int DelivertId = -1;
        instance.setID(DelivertId);
    }

    /**
     * Test of setDate method, of class Delivery. Like suggested in
     * Deliver.java: "HH:mm dd-MM-yy"
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "07:28 21.10.2015";
        Delivery instance = null;
        assertEquals(date, instance.getDate());
    }

    /**
     * Test of setDate method, of class Delivery. Like suggested in
     * Deliver.java: "HH:mm dd-MM-yy"
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDateWithMalformedDateString() {
        System.out.println("setDate");
        String date = "That day after Yesterday morning or so.";
        instance.setDate(date);
    }

    /**
     * Test of setDate method, of class Delivery. Like suggested in
     * Deliver.java: "HH:mm dd-MM-yy"
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDateWithIllegalMinute() {
        System.out.println("setDate");
        String date = "08:61 01.04.2017";
        instance.setDate(date);
    }
    
    /**
     * Test of setDate method, of class Delivery. Like suggested in
     * Deliver.java: "HH:mm dd-MM-yy"
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDateWithIllegalHour() {
        System.out.println("setDate");
        String date = "25:13 01.04.2017";
        instance.setDate(date);
    }

    /**
     * Test of setDate method, of class Delivery. Like suggested in
     * Deliver.java: "HH:mm dd-MM-yy"
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDateWithNonExistentDay() {
        System.out.println("setDate");
        String date = "12:12 31.11.2017";
        instance.setDate(date);
    }

    /**
     * Test of setDate method, of class Delivery. Like suggested in
     * Deliver.java: "HH:mm dd-MM-yy"
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDateWithWrongSymbols() {
        System.out.println("setDate");
        String date = "12:12 O1.II.2017";
        instance.setDate(date);
    }
}
