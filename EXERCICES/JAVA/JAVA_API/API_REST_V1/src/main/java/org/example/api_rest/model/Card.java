package org.example.api_rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private int id;
    private String name;
    private String marque;
    private String createAt;
    private String colorsCard;
}
