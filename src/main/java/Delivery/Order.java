/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;

/**
 *
 * @authors Luke & Tom
 */
public abstract class Order implements IComponentInterface
{
    private int ParcelId=0;
    private int CourierId=0;
    private String Status;
    public int ParceID()
    {
        /**
         * This method will return the parcel ID
         * @return int This is the parcel ID
         */
        return ParcelId; 
    }
    public void setParceID(int ParcelId)
    {
        /**
         * This method will set the parcel ID previously obtained from the last method
         */
        this.ParcelId=ParcelId;
    }
    public int getCourierID()
    {
        /**
         * This method will retrieve the courier ID
         * @return int This is the new courier ID
         */
        return CourierId;
    }
    public void setCourierID(int CourierId)
    {
        /**
         * This will set the courier ID to the one we just retrieved
         */
        this.CourierId=CourierId;
    }
    public String getStatus()
    {
        /**
         * This will retrieve the status of the parcel
         * @return string The status of the parcel
         */
        return Status;
    }
    public void setStatus(String Status)
    {
        /**
         * This will set the status of the parcel to the one just obtained
         */
        this.Status=Status;
    }
    public Order(int ParcelId,int CourierId,String Status)
    {
        /**
         * This will set the values of order to ones we just retrieved
         */
        this.ParcelId=ParcelId;
        this.CourierId=CourierId;
        this.Status=Status;
    }
    public String toString() 
    {    
        /**
         * This method will return the values we have obtained and set as a string instead of integers
         * @return string The ID of the parcel and Courier ID the ID of the courier
         */
        return "Order [ParcelId=" + ParcelId + ", CourierId=" + CourierId +  ", Status=" + Status; 
    } 
            
}
