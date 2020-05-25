package edu.gsu.petclinicapplication.services.map;

import edu.gsu.petclinicapplication.model.BaseEntity;

import java.util.*;

//Whoever extends this class, their T datatype must extend BaseEntity and their ID must extend Long
//This allows us to make assumptions about it such(such as the datatype having an id). For example, we can use object.getId now.
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    //They key of the map is a Long
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    //Auto Generates Id's
    T save( T object){
        //If the object is not equal to null but the id is
        if(object != null){
            //If object does not have an id, we will use the getNextId method created below.
            if(object.getId() == null){
                object.setId(getNextId());
            }
            //If the object has an id we will store it in the map.
            map.put(object.getId(), object);
        }
        //if object is equal to null
    else{
        throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        {
            //This so program doesnt blow up when map.keyset is called
            if (map.isEmpty())
                return 1L;
            else
                //max() method returns the maximum element of the given selection
                //keyset() method is used to create a set out of all the elements in a hashmap
                //So we create a set from the map keys (unique array) and return the maximum element + 1
                //This basically returns the nextId
                return Collections.max(map.keySet()) + 1;
        }
    }

}
