package com.crud.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persons")
public class Person {

    @Id
    private Integer personId;
    private String lastName;
    private String firstName;
    private String address;
    private String city;

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

//    @Override
//    public String toString() {
//        return "Person{" +
//                "personId=" + personId +
//                ", lastName='" + lastName + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", address='" + address + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }
}
