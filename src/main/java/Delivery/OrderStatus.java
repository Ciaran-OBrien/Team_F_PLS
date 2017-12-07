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
    REGISTERED,
    /**
     * Follows the registered status
     */
    COMPLETE_AND_DISPATCHED,
    /**
     * Follows the Complete and Dispatched status
     */
    INTRANSIT,
     /**
     * Follows the In Transit status
     */
    DELIVERED,
     /**
     * Set from customer side if they cancel the order
     */
    CANCELLED,
     /**
     * Set from courier side if there's a problem delivering package
     */
    PROBLEM
}
