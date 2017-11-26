/*
 * Author: Shona
 * Author: Lynn
 * Lecture: Bennard Humm
 */
package Person;

/**
 * Courier Class Entity with extends the Abstract 
 * @see AbstractPerson
 * @author Lynn_Ngx
 */
public class Courier extends AbstractPerson{
    
     /**
     * Constructor which implements the super class, AbstractPerson 
     * @param ID Unique Courier ID
     * @param Name Name of the Courier
     * @param Address Address of the Courier
     * TODO Should the courier not need to know where they are delivering the package to ??
     */
    public Courier(long ID, String Name, String Address) {
        super(ID, Name, Address);
    }  
    
     /**
     * Overriden toString method 
     * @return Courier details as a string
     */
    @Override
    public String toString(){
        return "";
    }
}