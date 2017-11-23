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
public abstract class AbstractPerson {

    private long ID;
    private String Name;
    private String Address;
    private PersonStatus status;
    
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
    
    public AbstractPerson(long ID, String Name, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
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

    @Override
    public abstract String toString();
    
}
