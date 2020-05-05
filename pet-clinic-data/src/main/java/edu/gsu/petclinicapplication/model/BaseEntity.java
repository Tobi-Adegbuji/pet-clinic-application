package edu.gsu.petclinicapplication.model;

import java.io.Serializable;

/*
Each of our model objects extend base entity, one way or another.
This is exactly what it mean. Its the base entity, which contains just the id for now.
So all of our objects have this id property. This closes issue 10 on Github
* */

public class BaseEntity implements Serializable {
    private Long id; //Hibernate recommends using box types since they can be null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
