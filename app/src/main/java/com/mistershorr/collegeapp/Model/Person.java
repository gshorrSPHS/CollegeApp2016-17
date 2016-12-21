package com.mistershorr.collegeapp.Model;

/**
 * Created by gshorr on 12/9/16.
 */
public abstract class Person {
    protected String firstName;
    protected String lastName;

    public Person() {
        firstName = "Roger";
        lastName = "Rabbit";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
