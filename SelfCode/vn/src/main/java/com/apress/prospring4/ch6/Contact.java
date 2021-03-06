package com.apress.prospring4.ch6;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Contact implements Serializable {
	// initial chap 6
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Contact - Id: " + id + ", First name: " + firstName 
            + ", Last name: " + lastName + ", Birthday: " + birthDate;
    }
}
