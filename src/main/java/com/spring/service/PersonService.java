package com.spring.service;

import com.spring.model.PersonEntity;

import java.util.List;

public interface PersonService {
    void createPerson(PersonEntity person);

    void updatePerson(PersonEntity person);

    void deletePerson(Long id);

    PersonEntity findPersonById(Long id);

    List<PersonEntity> findAll();
}
