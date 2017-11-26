/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;

/**
 *
 * @author Ciaran
 */
public abstract class AbstractPerson {

    /**
     * Private class fields
     */
    private long ID;
    private String Name;
    private String Address;
    private PersonStatus status;
    
    /** Method to get PersonStatus.
     * @return the status of the customer 
     */
    public PersonStatus getStatus() {
        return status;
    }

    /** Method to set Customer Status
     * @param status the status to set
     */
    public void setStatus(PersonStatus status) {
        this.status = status;
    }
    
    /**
     * Constructor for the Abstract Class
     * @param ID Passed in the super method of subclass
     * @param Name Passed in the super method of subclass
     * @param Address Passed in the super method of subclass
     */
    public AbstractPerson(long ID, String Name, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }
   
    
    /** Method to return an ID
     * @return ID of Customer or Courier
     */
    public long getID() {
        return ID;
    }

    /** Method to set an ID
     * @param aID the ID to set of either Customer/Courier
     */
    public void setID(long aID) {
        ID = aID;
    }

    /** Method to get a Name
     * @return the Name of Customer/Courier
     */
    public String getName() {
        return Name;
    }

    /** Method to set a Name
     * @param Name the Name to set of Customer/Courier
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /** Method to get an Address
     * @return the Address of Customer/Courier
     */
    public String getAddress() {
        return Address;
    }

    /** Method to set an Address
     * @param Address the Address to set of Customer/Courier
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Overidden method with a class specific implementation
     * @return String of details
     */
    @Override
    public abstract String toString();
    
}
