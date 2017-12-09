/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import Person.PersonManager;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jan
 */
public class PacketTrackingServiceTest {
    
    private PacketTrackingService service;
    private OrderManager orderManager;
    private PersonManager personManager;
    
    @Before
    public void setUp(){
        orderManager =  new OrderManager();
        personManager = new PersonManager();
        service = new PacketTrackingService(orderManager, personManager);        
    }
    
    /**
     * Test of registerNewOrder method, of class PacketTrackingService.
     */
    @Test
    public void testRegisterNewOrder_long_long() {
        System.out.println("registerNewOrder");

        
        
        fail("The test case is a prototype.");
    }

//    /**
//     * Test of registerNewOrder method, of class PacketTrackingService.
//     */
//    @Test
//    public void testRegisterNewOrder_String_String() {
//        System.out.println("registerNewOrder");
//
//        //service.registerNewOrder("Adam", "Bob");
//        //Order actual = orderManager.
//        
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of getOrderStatus method, of class PacketTrackingService.
//     */
//    @Test
//    public void testGetOrderStatus() {
//        System.out.println("getOrderStatus");
//        long orderId = 0L;
//        PacketTrackingService instance = null;
//        String expResult = "";
//        String result = instance.getOrderStatus(orderId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of incrementOrderStatus method, of class PacketTrackingService.
//     */
//    @Test
//    public void testIncrementOrderStatus() {
//        System.out.println("incrementOrderStatus");
//        long orderId = 0L;
//        PacketTrackingService instance = null;
//        instance.incrementOrderStatus(orderId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of reportDeliveryProblem method, of class PacketTrackingService.
//     */
//    @Test
//    public void testReportDeliveryProblem() {
//        System.out.println("reportDeliveryProblem");
//        long orderId = 0L;
//        PacketTrackingService instance = null;
//        instance.reportDeliveryProblem(orderId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of resetDevliverProcess method, of class PacketTrackingService.
//     */
//    @Test
//    public void testResetDevliverProcess() {
//        System.out.println("resetDevliverProcess");
//        long orderId = 0L;
//        PacketTrackingService instance = null;
//        instance.resetDevliverProcess(orderId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cancelOrderStatus method, of class PacketTrackingService.
//     */
//    @Test
//    public void testCancelOrderStatus() {
//        System.out.println("cancelOrderStatus");
//        long orderId = 0L;
//        PacketTrackingService instance = null;
//        instance.cancelOrderStatus(orderId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listProblematicOrders method, of class PacketTrackingService.
//     */
//    @Test
//    public void testListProblematicOrders() {
//        System.out.println("listProblematicOrders");
//        PacketTrackingService instance = null;
//        String expResult = "";
//        String result = instance.listProblematicOrders();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
