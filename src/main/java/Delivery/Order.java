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
        return ParcelId; 
    }
    public int getParceID()
    {
        return ParcelId;
    }
    public void setParceID(int ParcelId)
    {
        this.ParcelId=ParcelId;
    }
    public int getCourierID()
    {
        return CourierId;
    }
    public void setCourierID(int CourierId)
    {
        this.CourierId=CourierId;
    }
    public String getStatus()
    {
        return Status;
    }
    public void setStatus(String Status)
    {
        this.Status=Status;
    }
    public Order(int ParcelId,int CourierId,String Status)
    {
        this.ParcelId=ParcelId;
        this.CourierId=CourierId;
        this.Status=Status;
    }
    public String toString() 
    {    
        return "Order [ParcelId=" + ParcelId + ", CourierId=" + CourierId +  ", Status=" + Status; 
    } 
            
}
