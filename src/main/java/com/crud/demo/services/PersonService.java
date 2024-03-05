package com.crud.demo.services;

import com.crud.demo.entities.Person;
import com.crud.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public List<Person> getPersons(){
        List<Person> persons = personRepository.findAllCustom();
        return persons;
    }
}
