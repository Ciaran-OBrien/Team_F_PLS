/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Person.PersonTransactionRecord.TransactionType;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author jan
 */
public class PersonFileService {
    
    PersonManager personManager;

    public PersonFileService(PersonManager personManager) {
        this.personManager = personManager;
    }
    
    public PersonTransactionRecord registerPerson(String name, String address){
        Person p = personManager.createPerson(name, address);
        
        return new PersonTransactionRecord(p.getID(), TransactionType.CREATED);
    }
    
    public PersonTransactionRecord unregisterPerson(long id){
        boolean successful = personManager.destroyPerson(id);
        TransactionType type = TransactionType.DELETED;
        
        if(successful){
            return new PersonTransactionRecord(id, type);
        }else{
            return PersonTransactionRecord.getRecordForFailedTransaction(id, type);
        }
    }
    
    public PersonTransactionRecord modifyName(long id, String newName){
        
        TransactionType type = TransactionType.UPDATED;
        
        Person person = personManager.findPersonByID(id);
        person.setName(newName);
        personManager.updatePerson(person);
        
        return new PersonTransactionRecord(id, type);   
    }
    
    public PersonTransactionRecord modifyAdress(long id, String newAddress){
        
        TransactionType type = TransactionType.UPDATED;
        
        Person person = personManager.findPersonByID(id);
        person.setAddress(newAddress);
        personManager.updatePerson(person);
        
        return new PersonTransactionRecord(id, type);   
    }
    
    public String listAllSenders(){
        
        /**
         * TODO:
         * This is hacky. It would make sense for 
         * personManager.findPersonsByStatus() to return a SortedSet directly.
         */
        
        Collection<Person> senders = personManager.findPersonsByStatus(PersonStatus.SENDER);
        
        SortedSet<Person> ps = 
                new TreeSet<Person>((p1, p2) -> p1.getName().compareTo(p2.getName()));
        
        ps.addAll(senders);
        
        StringBuilder result = new StringBuilder();
        
        for(Person p : ps){
            result.append(p.getName());
            result.append(" | ");
            result.append(p.getAddress());
            result.append("\n");
        }
        
        return result.toString();
    }
    
    public String listAllReceivers(){
        throw new UnsupportedOperationException("not impl");
    }
    
    public String listAllCouriers(){
        throw new UnsupportedOperationException("not impl");
    }
}
