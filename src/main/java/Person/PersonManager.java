/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Person Entity Manager
 * This class implements all the relevant CRUD Implementations
 */
public class PersonManager {
       
    Map<Long,AbstractPerson> persons;
    
    public PersonManager(){
        this.persons = new HashMap();
    }
        
    /**
     * Method to create a new person, save to Map
     * @param newPerson Object type Customer from AbstractPerson
     * @return true or false for testing purposes
     */
    public boolean createPerson(AbstractPerson newPerson) {
        if (newPerson.getStatus() == PersonStatus.SENDER) {
            if (persons != null) {
                persons.put(newPerson.getID(), newPerson);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method to return a Customer object based off order ID
     * @param orderID passed to be found
     * @return Object Customer from persons map
     */
    public AbstractPerson findPersonByID (long orderID){
        return persons.get(orderID);       
    }  
    
    /**
     * Updates an order based of an order ID with a new order
     * @param orderID Given Order ID to be updating
     * @param newPerson Object type Customer from AbstractPerson
     * @return true or false for testing purposes
     */
    public boolean updatePerson(long orderID, AbstractPerson newPerson){
        
        if(persons.containsKey(orderID)){
            persons.put(orderID, newPerson);
            return true;
        }
        return false;
    }
    
    /**
     * Method to destroy an order based of the given ID of an order
     * @param orderID passed to be destroyed
     * @return true or false for testing purposes
     */
    public boolean destroyOrder(long orderID) {
        boolean destroyed  = persons.containsKey(orderID);
        persons.remove(orderID);
        return destroyed;
    }
}

