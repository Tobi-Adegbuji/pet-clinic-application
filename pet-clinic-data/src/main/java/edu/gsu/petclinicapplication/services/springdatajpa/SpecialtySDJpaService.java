package edu.gsu.petclinicapplication.services.springdatajpa;

import edu.gsu.petclinicapplication.model.Specialty;
import edu.gsu.petclinicapplication.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyService specialtyService;

    public SpecialtySDJpaService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyService.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyService.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyService.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyService.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyService.deleteById(aLong);
    }
}
