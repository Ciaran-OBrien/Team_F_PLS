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
    Person liam;
    Person finn;
    Person kevin;   
    Person fiona;
    Order finnKevin;
    Order kevinFinn;

    // TODO: PacketTrackingServiceTest & PersonFileServiceTest share same test data.
    
    @Before
    public void setUp() {
        orderManager =  new OrderManager();
        personManager = new PersonManager();
        trackingService = new PacketTrackingService(orderManager, personManager); 
        
        personsIds = new HashMap<>();
        Person person;
        
        liam = personManager.createPerson("Liam", "Jumpstreet 26");
        personsIds.put("Liam", liam.getID());
        
        finn = personManager.createPerson("Finn", "Park Ave 42");
        personsIds.put("Finn", finn.getID());
        
        kevin = personManager.createPerson("Kevin", "Cremona Road 23");
        personsIds.put("Kevin", kevin.getID());
        
        fiona = personManager.createPerson("Fiona", "Croftwood Drive 118");
        personsIds.put("Fiona", fiona.getID());
                
        personFileService = new PersonFileService(personManager);
        
        finnKevin = orderManager.createOrder(finn, kevin);
        kevinFinn = orderManager.createOrder(kevin, finn);
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

    /**
     * Test of getOrderStatus method, of class PacketTrackingService.
     */
    @Test
    public void testRegularOrderStatuses() {
        System.out.println("regularOrderStatuses");
        
        OrderStatus expected;
        OrderStatus actual;
        
        long orderId = kevinFinn.getOrderId();
        
        expected = OrderStatus.REGISTERED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
        
        trackingService.incrementOrderStatus(orderId);
        expected = OrderStatus.COMPLETE_AND_DISPATCHED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
        
        trackingService.incrementOrderStatus(orderId);
        expected = OrderStatus.INTRANSIT;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
        
        trackingService.incrementOrderStatus(orderId);
        expected = OrderStatus.DELIVERED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
    }
    
    /**
     * Test of getOrderStatus method, of class PacketTrackingService.
     */
    @Test
    public void testProblemOrderStatus() {
        System.out.println("exceptionalOrderStatuses");
        
        OrderStatus expected;
        OrderStatus actual;
        
        long orderId = kevinFinn.getOrderId();
        
        expected = OrderStatus.REGISTERED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
        
        trackingService.reportDeliveryProblem(orderId);
        expected = OrderStatus.PROBLEM;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
        
        trackingService.resetOrderStatus(orderId);
        expected = OrderStatus.REGISTERED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
    }
    
    /**
     * Test of getOrderStatus method, of class PacketTrackingService.
     */
    @Test
    public void testCancelledOrderStatus() {
        System.out.println("cancelledOrderStatus");
        
        OrderStatus expected;
        OrderStatus actual;
        
        long orderId = kevinFinn.getOrderId();
        
        expected = OrderStatus.REGISTERED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
        
        trackingService.cancelOrder(orderId);
        expected = OrderStatus.CANCELLED;
        actual = trackingService.getOrderStatus(orderId);
        assertEquals(expected, actual);
    }

    /**
     * Test of listProblematicOrders method, of class PacketTrackingService.
     */
    @Test
    public void testListProblematicOrders() {
        System.out.println("listProblematicOrders");
        
        long orderId = kevinFinn.getOrderId();
        
        trackingService.reportDeliveryProblem(orderId);

        String expected = orderId+"\n";
        String actual = trackingService.listProblematicOrders();
        
        assertEquals(expected, actual);
    }
    
}
