/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jan
 */
public class PersonFileServiceTest {
    
    PersonManager personManager;
    PersonFileService personFileService;
    Map<String, Long> personsIds;
    
    @Before
    public void setUp() {
        personManager = new PersonManager();
        personsIds = new HashMap<>();
        Person person;
        
        person = personManager.createPerson("Liam", "Jumpstreet 26");
        personsIds.put("Liam", person.getID());
        person = personManager.createPerson("Finn", "Park Ave 42");
        personsIds.put("Finn", person.getID());
        person = personManager.createPerson("Kevin", "Cremona Road 23");
        personsIds.put("Kevin", person.getID());
        person = personManager.createPerson("Fiona", "Croftwood Drive 118");
        personsIds.put("Fiona", person.getID());
                
        personFileService = new PersonFileService(personManager);
    }

    /**
     * Test of registerPerson method, of class PersonFileService.
     */
    @Test
    public void testRegisterPerson() {
        System.out.println("registerPerson");
        String expectedName = "Patrick O'Reilly";
        String expectedAddress = "The Oval 535";

        PersonTransactionRecord record = personFileService.registerPerson(expectedName, expectedAddress);
        assertEquals(PersonTransactionRecord.TransactionType.CREATED, record.type);
        assertTrue(record.succesful);
        
        Person actual = personManager.findPersonByID(record.personId);
        String actualName = actual.getName();
        String actualAddress = actual.getAddress();
        
        assertEquals(expectedName, actualName);
        assertEquals(expectedAddress, actualAddress);
    }

    /**
     * Test of unregisterPerson method, of class PersonFileService.
     */
    @Test
    public void testUnregisterPerson() {
        System.out.println("unregisterPerson");

        PersonTransactionRecord record = personFileService.unregisterPerson(personsIds.get("Liam"));
        assertEquals(PersonTransactionRecord.TransactionType.DELETED, record.type);
        
        Collection<Person> persons =  personManager.findPersonsByName("Liam");
        
        assertTrue(persons.isEmpty());
    }

    /**
     * Test of modifyName method, of class PersonFileService.
     */
    @Test
    public void testModifyName() {
        System.out.println("modifyName");
        String expectedName = "Lee Ann";
        String expectedAddress = "Jumpstreet 26";
        long id = personsIds.get("Liam");

        PersonTransactionRecord record = personFileService.modifyName(id, "Lee Ann");
        assertEquals(PersonTransactionRecord.TransactionType.UPDATED, record.type);
        assertTrue(record.succesful);
        
        Person actual = personManager.findPersonByID(record.personId);
        String actualName = actual.getName();
        String actualAddress = actual.getAddress();
        
        assertEquals(id, record.personId);
        assertEquals(expectedName, actualName);
        assertEquals(expectedAddress, actualAddress);
    }

    /**
     * Test of modifyAdress method, of class PersonFileService.
     */
    @Test
    public void testModifyAdress() {
        System.out.println("modifyAdress");
        String expectedName = "Kevin";
        String expectedAddress = "Many Tree Alley 26";
        long id = personsIds.get("Kevin");

        PersonTransactionRecord record = personFileService.modifyAdress(id, "Many Tree Alley 26");
        assertEquals(PersonTransactionRecord.TransactionType.UPDATED, record.type);
        assertTrue(record.succesful);
        
        Person actual = personManager.findPersonByID(record.personId);
        String actualName = actual.getName();
        String actualAddress = actual.getAddress();
        
        assertEquals(id, record.personId);
        assertEquals(expectedName, actualName);
        assertEquals(expectedAddress, actualAddress);
    }

    /**
     * Test of listAllSenders method, of class PersonFileService.
     */
    @Test
    public void testListAllSenders() {
        System.out.println("listAllSenders");
        
        StringBuilder expected = new StringBuilder();
        
        expected.append("Finn | Park Ave 42");
        expected.append("\n");
        expected.append("Fiona | Croftwood Drive 118");
        expected.append("\n");
        expected.append("Kevin | Cremona Road 23");
        expected.append("\n");
        expected.append("Liam | Jumpstreet 26");
        expected.append("\n");
        
        String actual = personFileService.listAllSenders();
        
        System.out.println(expected);
        System.out.println(actual);
        
        
        assertEquals(expected.toString().trim(), actual.trim());
    }
}
