package edu.gsu.petclinicapplication.services.map;

import edu.gsu.petclinicapplication.model.PetType;
import edu.gsu.petclinicapplication.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
       return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
        System.out.println("PetType deleted");
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
        System.out.println("Deleted");
    }
}
