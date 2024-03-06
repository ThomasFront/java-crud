package com.crud.demo.controllers;

import com.crud.demo.data.PersonDTO;
import com.crud.demo.entities.Person;
import com.crud.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @PostMapping("/persons")
    public PersonDTO createPerson(@RequestBody PersonDTO person){
        return personService.createPerson(person);
    }
    @PutMapping("/persons/{personId}")
    public PersonDTO createPerson(@RequestBody PersonDTO person, @PathVariable Integer personId){
        return personService.createPersonWithId(person, personId);
    }
}
