package org.example.api_rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
    private static int id = 0;
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private String phoneNumber;
    private String street;
    private String city;
    private String country;
    private String HouseNumber;

    public void Personne() {
        this.id = id + 1;
    }

}
