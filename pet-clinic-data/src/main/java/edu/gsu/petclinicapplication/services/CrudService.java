package edu.gsu.petclinicapplication.services;

import java.util.Set;

//Creating a base interface for other services. We are imitating the CRUDRepo Interface
//
public interface CrudService<T,ID> {

    Set<T> findAll(); //gets ALL instances from the table

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
