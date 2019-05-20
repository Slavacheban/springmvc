package com.spring.service;

import com.spring.model.PersonEntity;
import com.spring.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonServiceImpl implements PersonService {
    private PersonRepository repository;

    @Override
    public void createPerson(PersonEntity person) {
        repository.save(person);
    }

    @Override
    public void updatePerson(PersonEntity persin) {
        repository.save(persin);
    }

    @Override
    public void deletePerson(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PersonEntity findPersonById(Long id) {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public List<PersonEntity> findAll() {
        return repository.findAll();
    }
}
