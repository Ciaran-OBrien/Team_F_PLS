/*
 * Authors: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;

/**
 *
 * @authors 
 */
public class Customer {

    public static long ID = 1;
    private String Name;
    private String Address;
    
    public Customer(Long ID, String Name, String address) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }
    
    /**
     * This method will set the name of the customer
     * @param customerID
     */
    public void setID(Long customerID) {
        this.ID = customerID;
    }

    /**
     * This method will retrieve the customers ID
     * @return Long Customer ID
     */
    public Long getID() {
        return ID;
    }
    
    /**
     * This method will set the name of the customer
     * @param customerName
     */
    @Override
    public void setName(String customerName) {
        this.Name = customerName;
    }

    /**
     * This method will retrieve the customers name
     * @return string Customer name
     */
    @Override
    public String getName() {
        return Name;
    }

    /**
     * This method will set the customers address
     * @param customerAddress
     */
    @Override
    public void setAddres(String customerAddress) {
        this.Address = customerAddress;
    }
    /**
     * This method will retrieve the address of the customer
     * @return string Customer address
     */

    @Override
    public String getAddress() {
        return Address;
    }
    
}
