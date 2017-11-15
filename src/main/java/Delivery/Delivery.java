/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;
import java.io.*; 
import java.text.*; 
import java.util.*;

/**
 *
 * @authors Luke & Tom
 */

public abstract class Delivery implements IComponentInterface
{
    private int DeliveryId = 0;
    
    private String dateformat = "HH:mm dd-MM-yy ";
    public int getID()
    {
        /**
         * This method will retrieve the Delivery ID
         * @return int This will be the ID number
         */
        return DeliveryId;
    }
    public void setID(int DelivertId)
    {
        /**
         * This method will set the Delivery ID
         */
        this.DeliveryId=DeliveryId;
    }
    public String getDate()
    {
        /**
         * This method will retrieve date
         * @return string This will be the ID number
         */
        return dateformat;
    }
    public void setDate(String dateformat)
    {
        /**
         * This method will set the date
         */
        this.dateformat=dateformat;
    }
    public Delivery(int DeliveryId,String dateformate)
    {
        /**
         * This method will set the date and delivery ID
         */
        this.DeliveryId=DeliveryId;
        this.dateformat=dateformate;
    }
    public String toString() 
    {    
        /**
         * This method will return the delivery ID and the date as a string
         * @return string This will be the ID number
         */
        return "Deliver [id=" + DeliveryId + ", date=" + dateformat; 
    } 
}