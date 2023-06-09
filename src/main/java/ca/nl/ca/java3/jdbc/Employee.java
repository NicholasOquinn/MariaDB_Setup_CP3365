package ca.nl.ca.java3.jdbc;

import java.io.PrintStream;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int id;

    public Employee(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printEmployeeDetails(PrintStream printstream){
        printstream.printf("\nName: %s %s, Age: %d, ID: %d",
                this.getFirstName(), this.getLastName(), this.getAge(), this.getId());
    }

}