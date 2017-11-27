/*
 * Author: Ciarán O'Brien
 * Lecture: Bennard Humm
 */
package Person;
import Person.PersonStatus;

/**
 *
 * @author Ciaran
 */
public class Person {

    private long ID;
    private String Name;
    private String Address;
    private PersonStatus status;
    private boolean existingInDatabase;
    
    private static final String NAME_OF_A_PHANTOM_TEMPLATE = "[no person found with id %d]";
    
    private static long idCount = 0; 
    
    public Person(String Name, String Address) {
        this(Name, Address, PersonStatus.SENDER);
    }
    
    public Person(String Name, String Address, PersonStatus status) {
        this.ID = ++idCount;
        this.Name = Name;
        this.Address = Address;
        this.existingInDatabase = true;
        this.status = status;
    }
    
    public static Person getPhantom(long missingId){
        String phantomsName = String.format(NAME_OF_A_PHANTOM_TEMPLATE, missingId);
        
        Person phantom = new Person(phantomsName, "");
        phantom.existingInDatabase = false;
        return phantom;
    }
    
    /**
     * @return the status
     */
    public PersonStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(PersonStatus status) {
        this.status = status;
    }
    

    
    /**
     * @return the ID
     */
    public long getID() {
        return ID;
    }

    /**
     * @param aID the ID to set
     */
    public void setID(long aID) {
        ID = aID;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }    

    public boolean isExistingInDatabase() {
        return existingInDatabase;
    }
    
    
}
