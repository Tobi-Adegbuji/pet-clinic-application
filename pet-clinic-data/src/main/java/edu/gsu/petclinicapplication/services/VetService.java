package edu.gsu.petclinicapplication.services;

import edu.gsu.petclinicapplication.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
