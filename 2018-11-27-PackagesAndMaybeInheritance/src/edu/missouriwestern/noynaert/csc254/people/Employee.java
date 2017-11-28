package edu.missouriwestern.noynaert.csc254.people;

public class Employee extends Person{
    private String employeeID;

    public Employee(String name, Address address, String employeeID){
        super(name, address);
        this.employeeID = employeeID;
    }

    @Override
    public String toString(){
        return String.format("%s (%s)\n%s", name, employeeID,address);
    }
}
