/*
 * Authors: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;

/**
 *
 * @authors Ciaran
 * This interface will be implemented in the customer file
 */
public interface IPerson {
    
    /**
     * This method will set the customer name
     */
    public void setName();
    
    /**
     * This method will retrieve the customer name
     * @return string Name of the customer
     */
    public String getName();

    /**
     * This method will set the customer address
     */
    public void setAddres();
    
    /**
     * This method will return the customers address
     * @return string Customers address
     */
    public String getAddress();
}
