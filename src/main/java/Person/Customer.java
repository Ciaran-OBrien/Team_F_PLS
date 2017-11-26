/*
 * Authors: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;
/**
 * Customer Class Entity with extends the Abstract 
 * @see AbstractPerson
 * @author Lynn
 */

public class Customer extends AbstractPerson{

    /**
     * Constructor which implements the super class, AbstractPerson 
     * @param ID Unique Customer ID
     * @param Name Name of the Customer
     * @param Address Address of the Customer
     */
    public Customer(long ID, String Name, String Address) {
        super(ID, Name, Address);
    }
    
    private PersonStatus customerStatus;
    
    
    /**
     * Overriden toString method 
     * @return Customer details as a string
     */
    @Override
    public String toString() {
        return "";
    }

    /**
     * Method to get customer Status
     * @return enum status previously set
     */
    public PersonStatus getCustomerStatus() {
        return customerStatus;
    }

    /**
     * Method to set customer status
     * @param customerStatus enum status passed to method
     */
    public void setCustomerStatus(PersonStatus customerStatus) {
        this.customerStatus = customerStatus;
    }
}
