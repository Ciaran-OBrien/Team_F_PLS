/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Delivery;

import Delivery.OrderStatus;
import Delivery.Order;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ciarán
 */
public class OrderManager {

    Map<Long, Order> ordersToGo;

    private static long previousID = 0;

    public OrderManager() {
        this.ordersToGo = new HashMap();
    }

    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     * @param ParcelId
     * @param CourierId
     * @param OrderId
     * @return true or false for testing purposes
     */
    public boolean createOrder(int ParcelId, int CourierId, long OrderId) {
        Order newOrder = new Order(ParcelId, CourierId, OrderId);
        if (ordersToGo.containsKey(OrderId)){
            return false;
        }else{
        ordersToGo.put(OrderId, newOrder);
        return true;
        }
    }

    /**
     * Part of CRUD. Read order
     *
     * @param orderID
     * @return Order from id passed
     */
    public Order findOrderByID(long orderID) {
        return ordersToGo.get(orderID);
    }

    /**
     * Part of CRUD. Checks if the hashMap isn't null and puts new order
     *
     * @param OrderID
     * @param newStatus
     * @return true or false for testing purposes
     */
    public boolean updateOrderStatus(long OrderID, OrderStatus newStatus) {
        Order OrderToUpdate = findOrderByID(OrderID);
        if (ordersToGo.containsValue(OrderToUpdate.getOrderId())) {
            OrderToUpdate.setStatus(newStatus);
        } else {
            throw new IllegalArgumentException("Order does not exists with id:" + OrderID);
        }
        return false;
    }

    /**
     * Part of CRUD. Destroy based off ID passed
     *
     * @param orderID
     * @return true or false for testing purposes
     */
    public boolean destroyOrder(long orderID) {
        boolean destroyed  = ordersToGo.containsKey(orderID);
        ordersToGo.remove(orderID);
        return destroyed;
    }

    public Map<Long, Order> showAll() {
        return ordersToGo;
    }

}
