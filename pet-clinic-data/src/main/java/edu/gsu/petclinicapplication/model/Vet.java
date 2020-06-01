package edu.gsu.petclinicapplication.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    //Initialized so that when we call get Specialties from dataLoader class there will not be a null exception
    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
