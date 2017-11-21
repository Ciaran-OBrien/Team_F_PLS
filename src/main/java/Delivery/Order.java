/*
 * Authors: Luke & Tom
 * Lecture: Bennard Humm
 */
package Delivery;

/**
 *
 * @authors Luke & Tom
 */
public abstract class Order
{
    private int ParcelId=0;
    private int CourierId=0;
    private int OrderId = 0 ;
    private String Status;
    
    /**
    * This method will return the parcel ID
    * @return int This is the parcel ID
    */
    public int ParceID()
    {
        return ParcelId; 
    }
    
     /**
     * This method will set the parcel ID previously obtained from the last method
     * @param ParcelId
     */
    public void setParceID(int ParcelId)
    {
        this.ParcelId=ParcelId;
    }
    
    /**
    * This method will retrieve the courier ID
    * @return int This is the new courier ID
    */
    public int getCourierID()
    {
        return CourierId;
    }
    
    /**
    * This will set the courier ID to the one we just retrieved
     * @param CourierId
    */
    public void setCourierID(int CourierId)
    {
        this.CourierId=CourierId;
    }
    
    /**
    * This will retrieve the status of the parcel
    * @return string The status of the parcel
    */
    public String getStatus()
    {
        return Status;
    }
    
    /**
    * This will set the status of the parcel to the one just obtained
    * @param Status
    */
    public void setStatus(String Status)
    {
        this.Status=Status;
    }
    
    /**
    * This will set the values of order to ones we just retrieved
     * @param ParcelId
     * @param CourierId
     * @param Status
    */
    public Order(int ParcelId,int CourierId,String Status)
    {
        this.ParcelId=ParcelId;
        this.CourierId=CourierId;
        this.Status=Status;
        this.OrderId = OrderId ++ ;
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
