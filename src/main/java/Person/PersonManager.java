/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Jan
 */
public class PersonManager {

    Map<Long,Person> persons;

    public PersonManager(){
        this.persons = new HashMap();
    }
    // * ******************************************************************** */
    // * ************************** CREATE ********************************** */

    public void createPerson(String name, String address){
        Person person = new Person(name, address);
        persons.put(person.getID(), person);
    }

    // * ******************************************************************** */
      // * ************************** READ ************************************ */


      public Person findPersonByID (long ID){

          Person result = persons.getOrDefault(ID, Person.getPhantom(ID));

          return persons.get(ID);
      }

      public Collection<Person> findPersonsByStatus(PersonStatus status) {
          Collection<Person> result = new ArrayList<>();

          for (Entry<Long, Person> e : persons.entrySet()) {
              Person c = e.getValue();

              if (c.getStatus() == status) {
                  result.add(c);
              }
          }
          return result;
      }

      public Collection<Person> findPersonsByName(String nameSuffix){
          Collection<Person> result = new ArrayList<>();

          for(Entry<Long,Person> e : persons.entrySet()){
              Person c = e.getValue();

              if(c.getName().endsWith(nameSuffix)){
                  result.add(c);
              }
          }
          return result;
      }

    // * ******************************************************************** */
    // * ************************** UPDATE ********************************** */

    public boolean updatePerson(Person modifiedPerson){

        long personId = modifiedPerson.getID();

        if(!persons.containsKey(personId))
            return false;

        persons.put(personId, modifiedPerson);
        return true;
    }

    // * ******************************************************************** */
    // * ************************** DELETE ********************************** */

    public boolean destroyPerson(long ID){
        Person deleted = persons.remove(ID);
        return deleted != null;

    }
}
