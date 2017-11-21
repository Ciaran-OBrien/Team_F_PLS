/*
 * Author: Lynn
 * Lecture: Bennard Humm
 */
package Person;

/**
 *
 * @author Lynn_Ngx
 */
public abstract class Courier implements IPerson {
    
    public String Name;
    public String Address;

    /**
     * This method will set the name of the courier
     * @param name
     */
   @Override
    public void setName(String name) {}

    /**
     * This method will retrieve the name of the courier
     * @return string Courier name
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * This method will set the address of the courier
     * @param address
     */
    @Override
    public void setAddres(String address) {}

    /**
     * This method will return the address of the courier
     * @return string Courier address
     */
    @Override
    public String getAddress() {
        return null;
    }
    
    
}
