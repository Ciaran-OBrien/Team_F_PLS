/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;
import java.text.*; 
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

/**
 * Delivery Entity layer.
 * All getters and setters for the class are found here
 * @author Luke + Tom
 */

public abstract class Delivery{
    
    private static final String DEFAULT_DATE_FORMAT = "HH:mm dd-MM-yy";
    private int DeliveryId = 0;
    private String dateFormat;
    private LocalTime timeStamp;
    private Set<Order> orders;
    private Status status;
    
    public enum Status{
        CHARGING_PROCESS,
        IN_PROGRESS,
        FINISHED
    }
    
    String timeStamp_old = new SimpleDateFormat("HH:mm dd-MM-yy").format(new Date());

    public Delivery(int DeliveryId)
    {
        this.DeliveryId=DeliveryId;
        this.status = Status.CHARGING_PROCESS;
        this.dateFormat = DEFAULT_DATE_FORMAT;
    }
    
    /**
    * This method will set the date and delivery ID
     * @param DeliveryId Passed upon instantiation
     * @param dateformate Passed upon instantiation
    */
    @Deprecated
    public Delivery(int DeliveryId,String dateformate)
    {
        this.DeliveryId=DeliveryId;
        this.timeStamp = LocalTime.now();
    }    
    
    public void addOrder(Order order){
        // TODO: throw if full
        orders.add(order);
    }

    /**
    * This method will retrieve the Delivery ID
    * @return int This will be the ID number
    */
    public int getID()
    {
        return DeliveryId;
    }
    
    /**
         * This method will retrieve date
         * @return string This will be the ID number
    */
    public String getDate()
    {
        return timeStamp_old;
    }
    
    /**
    * This method will set the date
     * @param dateformat Passed to track date of delivery
    */
    public void setDate(String dateformat)
    {
        this.timeStamp_old=dateformat;
    }
    
    public void setDateFormat(String dateFormat){
        this.dateFormat = dateFormat;
    }
    
    public void setStatus(Status status){
        this.status = status;
    }
    
    /**
    * This method will return the delivery ID and the date as a string
    * @return string This will be the ID number
    */
    public String toString() 
    {    
        return "Deliver [id=" + DeliveryId + ", date=" + timeStamp_old; 
    } 
}



