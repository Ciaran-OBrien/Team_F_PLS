/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Person.Customer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lynn_Ngx
 */
public class PersonManager {
    
    //while()
    
    Map<Long,AbstractPerson> persons;
    
    public PersonManager(){
        this.persons = new HashMap();
    }
        
    /**
     *
     * @param newPerson
     * @return
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
    
    public AbstractPerson findPersonByID (long ID){
        return persons.get(ID);       
    }  
    
    public boolean updatePerson(AbstractPerson newPerson){
        if(persons.containsKey(newPerson.getID())){
            persons.put(newPerson.getID(), newPerson);
            return true;
        }
        return false;
    }
    
    public boolean destroyPerson(long ID){
        if(persons.containsKey(ID)){
            persons.remove(ID);
            return true;
        }
        return false;
    }
    
}

