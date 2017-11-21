/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;
import java.io.*; 
import java.text.*; 
import java.util.*;
import java.util.Date;

/**
 *
 * @authors Luke & Tom
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
    * This method will set the Delivery ID
     * @param DelivertId
    */
    public void setID(int DelivertId)
    {
        this.DeliveryId=DeliveryId;
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
     * @param dateformat
    */
    public void setDate(String dateformat)
    {
        this.timeStamp=dateformat;
    }
    
    /**
    * This method will set the date and delivery ID
     * @param DeliveryId
     * @param dateformate
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
