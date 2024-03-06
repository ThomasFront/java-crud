package com.crud.demo.services;

import com.crud.demo.data.PersonDTO;
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
        return personRepository.findAll();
    }

    @Transactional
    public PersonDTO createPerson(PersonDTO person) {
        Person personEntity = PersonDTO.fromPersonDTO(person);
        Person savedPerson = personRepository.save(personEntity);
        return PersonDTO.fromPerson(savedPerson);
    }

    @Transactional
    public PersonDTO createPersonWithId(PersonDTO personDTO, Integer personId){
        Person personEntity = PersonDTO.fromPersonDTO(personDTO, personId);
        personRepository.save(personEntity);
        return personDTO;
    }
}
