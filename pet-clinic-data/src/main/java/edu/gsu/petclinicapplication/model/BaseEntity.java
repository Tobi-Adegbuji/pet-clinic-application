package edu.gsu.petclinicapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/*
Each of our model objects extend base entity, one way or another.
This is exactly what it means. Its the base entity, which contains just the id for now.
So all of our objects have this id property. This closes issue 10 on Github
* */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass  //Tells JPA that other classes will inherit this class
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identity indicates that the persistence provider must assign pk's for the entity using a database identity column
    private Long id; //Hibernate recommends using box types since they can be null

}
