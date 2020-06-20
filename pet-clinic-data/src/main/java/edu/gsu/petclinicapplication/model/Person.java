package edu.gsu.petclinicapplication.model;

//Person is the base class

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "first_name") //Hibernate by default will name the column as such (in snake case). Just explicitly adding it.
    private String firstName;
    @Column(name = "last_name")
    private String lastName;


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
