package collectionsFramework;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Person> unserePersonen;
        Person p;
        Kunde k;
        String s;
      //  LinkedList<Person>  p = new  LinkedList<>();
          //Das Objekt unserePersonen wird
        // mit der Klasse LinkedList<E> instanziiert
        unserePersonen = new LinkedList<>();
        Kunde k1 = new Kunde("Cruise", "Tom", "Amrummer Strasse", 23211);
        Kunde k2 = new Kunde("Jolie", "Angelina", "Amrummer Strasse", 2232);
        Kunde k3 = new Kunde("Deneuve", "Catherine", "Amrummer Strasse", 2311111);
        unserePersonen.add(k1);
        unserePersonen.add(k2);
        unserePersonen.add(k3);
        Iterator<Person> it = unserePersonen.iterator();
        while (it.hasNext()) System.out.println(it.next().getVorname());
        for(Person pp: unserePersonen){
            System.out.println(pp);
        }
    }
}