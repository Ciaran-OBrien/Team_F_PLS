/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.time.LocalTime;

/**
 *
 * @author jan
 */
public class PersonTransactionRecord {
    
    public enum TransactionType{
        CREATED,
        UPDATED,
        DELETED
    }
    
    public PersonTransactionRecord(long personId, 
                                     TransactionType type) {
        this.personId = personId;
        this.type = type;
        this.timeStamp = LocalTime.now();
        this.succesful = true;
    }
    
    private PersonTransactionRecord(long personId, 
                                     TransactionType type,
                                     boolean succesful) {
        this.personId = personId;
        this.type = type;
        this.timeStamp = LocalTime.now();
        this.succesful = succesful;
    }
    
    public static PersonTransactionRecord getRecordForFailedTransaction(long personId, 
                                                                 TransactionType type) {
        return new PersonTransactionRecord(personId, type, false);
    }
    
    public final long personId;
    public final TransactionType type;
    public final LocalTime timeStamp;
    public final boolean succesful;
}
