package org.example.api_rest.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.api_rest.model.Card;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CardService {

    private List<Card> cards;

    public CardService() {
        cards = new ArrayList<>();
        Card card = new Card();
        card.setId(cards.size() + 1);
        card.setName("Nissan Juke");
        card.setMarque("Nissan");
        card.setColorsCard("Blanc");
        card.setCreateAt("01 janvier 2023");
        cards.add(card);
    }

    //    public static Card save(int id, String name, String marque, String colorCard, String createAt) {
//        Card newCard = new Card();
//        newCard.setId(id);
//        newCard.setName(name);
//        newCard.setMarque(marque);
//        newCard.setColorsCard(colorCard);
//        newCard.setCreateAt(createAt);
//        return newCard;
//    }
    public Card save(Card card) {
        card.setId(cards.size() + 1);
        cards.add(card);
        return card;
    }

    public List<Card> findAll() {
        return cards;
    }

    public Card update(int id,Card card){
        int idSelect = id -1;
        cards.get(idSelect).setName(card.getName());
        cards.get(idSelect).setColorsCard(card.getColorsCard());
        cards.get(idSelect).setMarque(card.getMarque());
        cards.get(idSelect).setCreateAt(card.getCreateAt());

        return cards.get(idSelect);
    }

    public String deleteCard(int id) {
        cards.remove(id - 1);
        return "L'élément " + id + " à été supprimer";
    }
}
