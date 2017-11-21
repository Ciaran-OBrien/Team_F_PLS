/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Delivery;

import Delivery.OrderStatus;
import Delivery.Order;
import java.util.HashMap;

/**
 *
 * @author Ciarán
 */
public class OrderManager {
    
    
    HashMap<Long,Order> ordersToGo;
    OrderStatus Status;

    public OrderManager() {
        this.ordersToGo = new HashMap();
    }
    
    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     * @param newOrder
     * @return true or false for testing purposes
     */
    public boolean createOrder(Order newOrder){
        if(ordersToGo!=null){
            ordersToGo.put(Long.valueOf(newOrder.getID()), newOrder);
            return true;
        }
        return false;
    }
    
    /**
     * Part of CRUD. Read order
     * @param orderID
     * @return Order from id passed
     */
    public Order readOrder (long orderID){
        return ordersToGo.get(orderID);       
    }    
    
    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     * @param update Enum status passed
     * @return true or false for testing purposes
     */
    public boolean updateOrder(OrderStatus update){
        switch(update){
            case Registered:
                Status = OrderStatus.CompleteAndDispatched;
                return true;
            case CompleteAndDispatched:
                Status = OrderStatus.Intransit;
                return true;
            case Intransit:
                Status = OrderStatus.Delievered;
                return true;
        }
        return false;
    }
    
    /**
     * Part of CRUD. Destroy based off ID passed
     * @param orderID
     * @return true or false for testing purposes
     */
    public boolean destroyOrder(long orderID){
        if(ordersToGo.containsKey(orderID)){
            ordersToGo.remove(orderID);
            return true;
        }
        return false;
    }
    
}
