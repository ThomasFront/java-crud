package com.crud.demo.data;

import com.crud.demo.entities.Person;

public class PersonDTO {

    private String lastName;
    private String firstName;
    private String address;
    private String city;

    public PersonDTO(String lastName, String firstName, String address, String city) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    public static Person fromPersonDTO(PersonDTO personDTO){
        return new Person(null, personDTO.lastName, personDTO.firstName, personDTO.address, personDTO.city);
    }
    public static Person fromPersonDTO(PersonDTO personDTO, Integer personId){
        return new Person(personId, personDTO.lastName, personDTO.firstName, personDTO.address, personDTO.city);
    }
    public static PersonDTO fromPerson(Person person){
        return new PersonDTO(person.getLastName(), person.getFirstName(), person.getAddress(), person.getCity());
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
