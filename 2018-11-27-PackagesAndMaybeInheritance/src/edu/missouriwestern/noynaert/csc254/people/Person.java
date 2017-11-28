package edu.missouriwestern.noynaert.csc254.people;

public class Person implements Comparable<Person> {
    protected String name;
    protected Address address;

    public Person(){
        name = "Annonymous";
        Address a = new Address("123 Main", "55555");
        a.city = "Cleveland";
        //a.street = "asdflkjsdfl;kj";    Private
        a.zip = "xxxxx";                 //Package protected
        Address b = new Address();
    }

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public Person(String name, String street, String zip){
        this.name = name;
        this.address = new Address(street, zip);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return String.format("%s\n%s", name, address);
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
