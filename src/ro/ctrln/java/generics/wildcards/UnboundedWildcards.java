package ro.ctrln.java.generics.wildcards;

import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.model.Person;

public class UnboundedWildcards {

    public static void main(String[] args) {

        GenericList<?> persons = new GenericList<Person>();

      // persons.addElement(new Object());

        // ? trebuie fol in mom in care chiar nu stim tipul de date pe care il returnam in mom in care parcurgem o lista de elemente
    }
}
