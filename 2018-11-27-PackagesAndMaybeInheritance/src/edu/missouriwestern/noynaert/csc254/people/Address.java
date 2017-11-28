package edu.missouriwestern.noynaert.csc254.people;

public class Address {
    private String street;
    public String city = "Scranton";
    public String state = "PA";
    /*package protected*/ String zip;

    public Address(String street, String zip){
        this.street = street;
        this.zip = zip;
    }


    public Address(){
        this.street = "Unknown";
        this.zip = "?????";
    }

    @Override
    public String toString(){
        return String.format("%s\n%s, %s   %s", street, city, state, zip);
    }
}
