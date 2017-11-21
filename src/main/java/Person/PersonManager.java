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
    
    Map<Long,Customer> cust;
    
    public PersonManager(){
        this.cust = new HashMap();
    }
        
    /**
     *
     * @param newCustomer
     * @return
     */
    public boolean createCustomer(Customer newCustomer){
        if(cust!=null){
            cust.put(Customer.ID, newCustomer);
            Customer.ID++;
            return true;
        }
        return false;
    }
    
    public Customer readOrder (long ID){
        return cust.get(ID);       
    }  
    
    public boolean updateCustomer(Customer customer){
        if(cust.containsKey(Customer.ID)){
            cust.put(Customer.ID, customer);
            return true;
        }
        return false;
    }
    
    public boolean destroyCustomer(long ID){
        if(cust.containsKey(ID)){
            cust.remove(ID);
            return true;
        }
        return false;
    }
    
}

