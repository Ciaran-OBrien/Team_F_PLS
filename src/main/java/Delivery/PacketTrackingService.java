/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import Person.Person;
import Person.PersonManager;
import java.util.List;

/**
 *
 * @author jan
 */
public class PacketTrackingService {
    
    OrderManager orderManager;
    PersonManager personManager;

    public PacketTrackingService(OrderManager orderManager, 
                                 PersonManager personManager) {
        this.orderManager = orderManager;
        this.personManager = personManager;
    }
    
    public TrackingRecord registerNewOrder(long senderId, long receiverId){
        
        Person sender = personManager.findPersonByID(senderId);
        Person receiver = personManager.findPersonByID(receiverId);
        
        Order order = orderManager.createOrder(sender, receiver);
        
        TrackingRecord record = new TrackingRecord(        -1, 
                                            order.getOrderId(), 
                                                     senderId, 
                                                   receiverId, 
                                     order.getStatus().name());
        
        return record;
    }
    
    public TrackingRecord incrementOrderStatus(long orderId){
        
        Order order = orderManager.findOrderByID(orderId);
        
        OrderStatus nextStatus = order.getStatus().getNextRegular();
        orderManager.updateOrderStatus(orderId, nextStatus);
        
        TrackingRecord record = new TrackingRecord(-1, order, nextStatus.name());
        
        return record;
    }
    
    public TrackingRecord reportDeliveryProblem(long orderId){
        
        Order order = orderManager.findOrderByID(orderId);

        orderManager.updateOrderStatus(orderId, OrderStatus.PROBLEM);
        
        TrackingRecord record = new TrackingRecord(-1, order, OrderStatus.PROBLEM.name());
        
        return record;
    }
    
    public TrackingRecord resetOrderStatus(long orderId){
        
        Order order = orderManager.findOrderByID(orderId);

        orderManager.updateOrderStatus(orderId, OrderStatus.REGISTERED);
        
        TrackingRecord record = new TrackingRecord(-1, order, OrderStatus.REGISTERED.name());
        
        return record;        
    }
    
    public TrackingRecord cancelOrder(long orderId){
        
        Order order = orderManager.findOrderByID(orderId);

        orderManager.updateOrderStatus(orderId, OrderStatus.CANCELLED);
        
        TrackingRecord record = new TrackingRecord(-1, order, OrderStatus.CANCELLED.name());
        
        return record;      
    }
    
    public String listProblematicOrders(){
        
        List<Order> problematicOrders = orderManager.findOrderByStatus(OrderStatus.PROBLEM);
        StringBuilder sb = new StringBuilder();
        
        problematicOrders.forEach(o -> sb.append(o.getOrderId()).append("\n"));
        
        return sb.toString();
    }

    public OrderStatus getOrderStatus(long orderId){
        
        Order order = orderManager.findOrderByID(orderId);
        
        return order.getStatus();
    }
}
