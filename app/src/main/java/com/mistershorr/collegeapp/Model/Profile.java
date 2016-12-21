package com.mistershorr.collegeapp.Model;

import java.util.Date;

/**
 * Created by gshorr on 12/7/16.
 */
public class Profile {
    private String firstName, lastName;
    private Date birthday;

    public String getFirstName() {
        return firstName;
    }

    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
