/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;

import Person.Person;

 /**
 * Order Entity layer.
 * All getters and setters for the class are found here
 * @author Luke + Tom
 */
public class Order{
    
    @Deprecated
    private int ParcelId;
    @Deprecated
    private int CourierId;
    private Person sender;
    private Person receiver;
    
    private long OrderId;
    OrderStatus Status;
    
    private static long idCount = 0; 
    
    public Order(Person sender, Person receiver){
        this.sender = sender;
        this.receiver = receiver;
        this.Status = OrderStatus.REGISTERED;
        this.OrderId = ++idCount;
    }
    
    /**
    * This will set the values of order to ones we just retrieved
     * @param ParcelId Passed upon instantiation
     * @param CourierId Passed upon instantiation
     * @param OrderId Passed upon instantiation 
    */
    @Deprecated
    public Order(int ParcelId, int CourierId, long OrderId) {
        this.ParcelId = ParcelId;
        this.CourierId = CourierId;
        this.OrderId = OrderId;
        this.Status = OrderStatus.REGISTERED;
    }
  
    public int getParcelId() {
        return ParcelId;
    }
    
    /**
    * This method will return the parcel ID
    * @return long This is the parcel ID
    */
    public long getOrderId(){
        return OrderId; 
    }

    
    /**
    * This method will retrieve the courier ID
    * @return int This is the new courier ID
    */
    public int getCourierID(){
        return CourierId;
    }

    
    /**
    * This will retrieve the status of the parcel
    * @return string The status of the parcel
    */
    public OrderStatus getStatus(){
        return Status;
    }
    
    /**
    * This will set the status of the parcel to the one just obtained
    * @param Status Passed upon changes to order status
    */

    public void setStatus(OrderStatus Status){
        this.Status=Status;
    }

    public Person getSender() {
        return sender;
    }

    public Person getReceiver() {
        return receiver;
    }
    
    /**
    * This method will return the values we have obtained and set as a string instead of integers
    * @return string The ID of the parcel and Courier ID the ID of the courier
    */
    public String toString() 
    {    
        return "Order [ParcelId=" + ParcelId + ", CourierId=" + CourierId +  ", Status=" + Status; 
    } 
            
}
