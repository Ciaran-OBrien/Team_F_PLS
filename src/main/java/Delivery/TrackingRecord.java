/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import java.time.LocalTime;

/**
 *
 * @author jan
 */
public class TrackingRecord {

    // TODO: needed?
    protected TrackingRecord(long deliveryId, 
                             long orderId, 
                             long senderId, 
                             long receiverId, 
                             String status) {
        this.deliveryId = deliveryId;
        this.orderId = orderId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.status = status;
        this.timeStamp = LocalTime.now();
    }
    
    protected TrackingRecord(long deliveryId, 
                             Order order,
                             String status) {
        this.deliveryId = deliveryId;
        this.orderId = order.getOrderId();
        this.senderId = order.getSender().getID();
        this.receiverId = order.getReceiver().getID();
        this.status = status;
        this.timeStamp = LocalTime.now();
    }
    
    public final long deliveryId;
    public final long orderId;
    public final long senderId;
    public final long receiverId;
    public final String status;
    public final LocalTime timeStamp;
    
}
