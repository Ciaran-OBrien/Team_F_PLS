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
     * -> Packet waits for allocation to delivery (Van Tour).
     */
    REGISTERED,
    /**
     * Follows the registered status
     * -> Packet is dispatched, delivery tour isn't started yet.
     */
    COMPLETE_AND_DISPATCHED,
    /**
     * Follows the Complete and Dispatched status
     * -> Packet is on the road.
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
