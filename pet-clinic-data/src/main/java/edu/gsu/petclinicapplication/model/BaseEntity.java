package edu.gsu.petclinicapplication.model;

import java.io.Serializable;

/*
Each of our classes extend base entity, one way or another.
This is exactly what it mean. Its the base entity, which contains just the id for now.
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
