/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Delivery;

/**
 * Enum class of Order Statuses
 * @author Ciaran
 */
public enum OrderStatus {
    /**
     * Default for all orders upon instantiation
     */
    Registered,
    /**
     * Follows the registered status
     */
    CompleteAndDispatched,
    /**
     * Follows the Complete and Dispatched status
     */
    Intransit,
     /**
     * Follows the In Transit status
     */
    Delievered,
     /**
     * Set from customer side if they cancel the order
     */
    Cancelled,
     /**
     * Set from courier side if there's a problem delivering package
     */
    Problem
}
