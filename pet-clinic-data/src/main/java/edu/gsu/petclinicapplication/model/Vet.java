package edu.gsu.petclinicapplication.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER) //Eager: JPA will try and load everything at once
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    //Initialized so that when we call get Specialties from dataLoader class there will not be a null exception
    private Set<Specialty> specialties = new HashSet<>();


}
