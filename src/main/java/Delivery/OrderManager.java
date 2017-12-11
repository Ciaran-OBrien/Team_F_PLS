/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Delivery;

import Person.Person;
import java.util.HashMap;
import java.util.Map;
import SystemUtil.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * Order Entity Manager
 * This class implements all the relevant CRUD Implementations
 * @author Ciarán
 */
public class OrderManager {


    Map<Long, Order> ordersToGo;
    
    PriorityQueue<Order> orders;
    
    

    private static long previousID = 0;

    /**
     * Constructor to instantiate ordersToGo Hashmap.
     */
    public OrderManager() {
        this.ordersToGo = new HashMap();
        
        this.orders = new PriorityQueue<Order>(
        (a,b) -> Integer.compare(a.getStatus().ordinal(), 
                                 b.getStatus().ordinal()));
    }

    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     * @param ParcelId passed to be created
     * @param CourierId passed to be created
     * @param OrderId passed to be created
     * @return true or false for testing purposes
     */
    public Order createOrder(Person sender, Person receiver) {
        
        Order newOrder = new Order(sender, receiver);
        
        orders.add(newOrder);
        
        // TODO: Check precondition: Id shall not exist yet!
        ordersToGo.put(newOrder.getOrderId(), newOrder);
        Logger.LogMessage("Order Created");
        
        return newOrder;
    }
    
    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     * @param ParcelId passed to be created
     * @param CourierId passed to be created
     * @param OrderId passed to be created
     * @return true or false for testing purposes
     */
    @Deprecated
    public boolean createOrder(int ParcelId, int CourierId, long OrderId) {
        Order newOrder = new Order(ParcelId, CourierId, OrderId);
        if (ordersToGo.containsKey(OrderId)){
            return false;
        }else{
            ordersToGo.put(OrderId, newOrder);
            Logger.LogMessage("Order Created");
            return true;
        }
    }

    /**
     * Part of CRUD. Read order
     *
     * @param orderID passed to be found
     * @return Order from id passed
     */
    public Order findOrderByID(long orderID) {
        Logger.LogMessage("Order Found");
        return ordersToGo.get(orderID);
    }
    

    public List<Order> findOrderByStatus(OrderStatus status) {
        
        List<Order> filtered = ordersToGo.entrySet()
                                       .stream()
                                       .map(entrySet -> entrySet.getValue())
                                       .filter(order -> order.getStatus().equals(status))
                                       .collect(Collectors.toList());

        return filtered;
    }

    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     *
     * @param OrderID passed to be updated
     * @param newStatus passed to be updated
     * @return true or false for testing purposes
     */
    public boolean updateOrderStatus(long OrderID, OrderStatus newStatus) {
        Order OrderToUpdate = findOrderByID(OrderID);
        if (ordersToGo.containsKey(OrderToUpdate.getOrderId())) {
            OrderToUpdate.setStatus(newStatus);
            Logger.LogMessage("Order Updated");
        } else {
            throw new IllegalArgumentException("Order does not exists with id:" + OrderID);
        }
        return false;
    }

    /**
     * Part of CRUD. Destroy based off ID passed
     *
     * @param orderID passed to be destroyed
     * @return true or false for testing purposes
     */
    public boolean destroyOrder(long orderID) {
        boolean destroyed  = ordersToGo.containsKey(orderID);
        ordersToGo.remove(orderID);
        Logger.LogMessage("Order Destroyed");
        return destroyed;
    }

    public Map<Long, Order> showAll() {
        return ordersToGo;
    }

}
