/*
 * Authors: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;
import Status.OrderStatus;
/**
 *
 * @authors 
 */

public class Customer extends AbstractPerson{

    public Customer(long ID, String Name, String Address) {
        super(ID, Name, Address);
    }
    
    private OrderStatus customerStatus;
    
    

    @Override
    public String toString() {
        return "";
    }

    public OrderStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(OrderStatus customerStatus) {
        this.customerStatus = customerStatus;
    }
}
