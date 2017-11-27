/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;
import java.text.*; 
import java.util.Date;

/**
 * Delivery Entity layer.
 * All getters and setters for the class are found here
 * @author Luke + Tom
 */

public abstract class Delivery
{
    private int DeliveryId = 0;
    
    String timeStamp = new SimpleDateFormat("HH:mm dd-MM-yy").format(new Date());
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
        return timeStamp;
    }
    
    /**
    * This method will set the date
     * @param dateformat Passed to track date of delivery
    */
    public void setDate(String dateformat)
    {
        this.timeStamp=dateformat;
    }
    
    /**
    * This method will set the date and delivery ID
     * @param DeliveryId Passed upon instantiation
     * @param dateformate Passed upon instantiation
    */
    public Delivery(int DeliveryId,String dateformate)
    {
        this.DeliveryId=DeliveryId;
        this.timeStamp=dateformate;
    }
    
    /**
    * This method will return the delivery ID and the date as a string
    * @return string This will be the ID number
    */
    public String toString() 
    {    
        return "Deliver [id=" + DeliveryId + ", date=" + timeStamp; 
    } 

}



