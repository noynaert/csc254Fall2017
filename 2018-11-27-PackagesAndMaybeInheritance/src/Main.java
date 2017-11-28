import edu.missouriwestern.noynaert.csc254.people.Address;
import edu.missouriwestern.noynaert.csc254.people.Employee;
import edu.missouriwestern.noynaert.csc254.people.Person;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Address a = new Address("123 Main", "55555");
        a.city = "Cleveland";
        //a.street = "asdflkjsdfl;kj";     Private
        //a.zip = "xxxxx";                 Package protected
        Address b = new Address();

        System.out.println(a);
        System.out.println("\n" + b);

        System.out.println("-----------------");
        Person pa = new Person();
        Person pb = new Person("John", a);
        Person pc = new Person("Mary", new Address("12345 Fredrick", "65406"));
        Person pd = new Person("Tina", "5678 Belt Hwy", "64501");
        Person pe = new Person();
        Person pf = new Person("Aaron", a);

        ArrayList<Person> list = new ArrayList<>();
        list.add(pa);
        list.add(pb);
        list.add(pc);
        list.add(pd);
        list.add(pe);
        list.add(pf);

        Employee boss = new Employee("Mr. Slate", a, "E000000");
        System.out.println(boss);

        list.add(boss);

        printList(list);
        Collections.sort(list);
        printList(list);
    }

    public static void printList(ArrayList<Person> list){
        System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for(Person p: list){
            System.out.println(p + " " + p.hashCode());
            System.out.println();
        }
    }
}
