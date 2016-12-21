package com.mistershorr.collegeapp.Model;

/**
 * Created by gshorr on 12/9/16.
 */
public class Guardian extends Person{
    private String occupation;
    private int age;

    public Guardian()
    {
        this.occupation = "Professional Rabbit";
        this.age = 40;
    }

    public Guardian(String occupation, int age) {
        this.occupation = occupation;
        this.age = age;
    }

    public Guardian(String firstName, String lastName, String occupation, int age) {
        super(firstName, lastName);
        this.occupation = occupation;
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
