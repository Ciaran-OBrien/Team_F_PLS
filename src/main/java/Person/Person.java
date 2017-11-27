/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;

/**
 *
 * @author Ciaran
 */
public class Person {

    /**
     * Private class fields
     */
    private long ID;
    private String Name;
    private String Address;
    private PersonStatus Status;
    
        
    /**
     * Constructor for the Abstract Class
     * @param ID Passed in the super method of subclass
     * @param Name Passed in the super method of subclass
     * @param Address Passed in the super method of subclass
     * @param Status
     */
    public Person(long ID, String Name, String Address, PersonStatus Status) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Status = Status; 
    }
    
    /** Method to get PersonStatus.
     * @return the status of the customer 
     */
    public PersonStatus getStatus() {
        return Status;
    }

    /** Method to set Customer Status
     * @param Status the Status to set
     */
    public void setStatus(PersonStatus Status) {
        this.Status = Status;
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
    public String toString(){
        return "Person details";
    }
    
}
