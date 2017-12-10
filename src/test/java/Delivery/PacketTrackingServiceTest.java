/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import Person.Person;
import Person.PersonFileService;
import Person.PersonManager;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jan
 */
public class PacketTrackingServiceTest {
    
    private PacketTrackingService trackingService;
    private OrderManager orderManager;
    private PersonManager personManager;
    private PersonFileService personFileService;
    Map<String, Long> personsIds;

    // TODO: PacketTrackingServiceTest & PersonFileServiceTest share same test data.
    
    @Before
    public void setUp() {
        orderManager =  new OrderManager();
        personManager = new PersonManager();
        trackingService = new PacketTrackingService(orderManager, personManager); 
        
        personsIds = new HashMap<>();
        Person person;
        
        person = personManager.createPerson("Liam", "Jumpstreet 26");
        personsIds.put("Liam", person.getID());
        person = personManager.createPerson("Finn", "Park Ave 42");
        personsIds.put("Finn", person.getID());
        person = personManager.createPerson("Kevin", "Cremona Road 23");
        personsIds.put("Kevin", person.getID());
        person = personManager.createPerson("Fiona", "Croftwood Drive 118");
        personsIds.put("Fiona", person.getID());
                
        personFileService = new PersonFileService(personManager);
    }
    
    /**
     * Test of registerNewOrder method, of class PacketTrackingService.
     */
    @Test
    public void testRegisterNewOrder() {
        System.out.println("registerNewOrder");
        
        long liamsId = personsIds.get("Liam");
        long fionasId = personsIds.get("Fiona");
        Person liam = personManager.findPersonByID(liamsId);
        Person fiona = personManager.findPersonByID(fionasId);
        
        TrackingRecord record = trackingService.registerNewOrder(fionasId, liamsId);
        
        long orderId = record.orderId;
        
        // Evaluate record
        assertEquals(liamsId, record.receiverId);
        assertEquals(fionasId, record.senderId);
        
        //Evaluate order
        Order order = orderManager.findOrderByID(orderId);
        assertEquals(fiona, order.getSender());
        assertEquals(liam, order.getReceiver());
        assertEquals(OrderStatus.REGISTERED, order.getStatus());
    }

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
