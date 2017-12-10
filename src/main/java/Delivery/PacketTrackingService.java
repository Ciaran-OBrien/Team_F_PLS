/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import Person.Person;
import Person.PersonManager;

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
        throw new UnsupportedOperationException("not impl");
    }
    
    public TrackingRecord reportDeliveryProblem(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
    
    public TrackingRecord resetDevliverProcess(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
    
    public TrackingRecord cancelOrderStatus(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
    
    public String listProblematicOrders(){
        throw new UnsupportedOperationException("not impl");
    }

    public String getOrderStatus(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
}
