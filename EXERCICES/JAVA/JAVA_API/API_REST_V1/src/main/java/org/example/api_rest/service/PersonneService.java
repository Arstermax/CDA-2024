package org.example.api_rest.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.api_rest.model.Personne;

@ApplicationScoped
public class PersonneService {

    public Personne save(String firstname, String lastname, int age, String houseNumber, String street, String city, String country, String phoneNumber) {
        Personne newPersonne = new Personne();
        newPersonne.setFirstname(firstname);
        newPersonne.setLastname(lastname);
        newPersonne.setAge(age);
        newPersonne.setHouseNumber(houseNumber);
        newPersonne.setStreet(street);
        newPersonne.setCity(city);
        newPersonne.setCountry(country);
        newPersonne.setPhoneNumber(phoneNumber);
        return newPersonne;
    }
}
