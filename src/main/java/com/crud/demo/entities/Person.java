package com.crud.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;

    public Person(Integer personId, String lastName, String firstName, String address, String city) {
        this.personId = personId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
    }

    public Person() {
    }

    public Integer getPersonId() {
        return personId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }
}
