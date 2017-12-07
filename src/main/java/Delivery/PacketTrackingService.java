/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

/**
 *
 * @author jan
 */
public class PacketTrackingService {
    
    public void registerNewOrder(long senderId, long receiverId){
        throw new UnsupportedOperationException("not impl");
    }
    
    public void registerNewOrder(String newSenderName, String newReceiverName){
        throw new UnsupportedOperationException("not impl");
    }
    
    public String getOrderStatus(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
    
    public void incrementOrderStatus(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
    
    public void reportDeliveryProblem(){
        throw new UnsupportedOperationException("not impl");
    }
    
    public void cancelOrderStatus(long orderId){
        throw new UnsupportedOperationException("not impl");
    }
}
