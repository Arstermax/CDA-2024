package org.example.api_rest.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.api_rest.model.Card;
import org.example.api_rest.service.CardService;

import java.util.ArrayList;
import java.util.List;

@Path("/Card")
public class CardController {


    private final CardService cardService;

    @Inject
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }


//    @POST
//    @Path("/Add")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Card AddCard(
//            @FormParam("id") int id,
//            @FormParam("name") String name,
//            @FormParam("marque") String marque,
//            @FormParam("createAt") String createAt,
//            @FormParam("colorsCard") String colorsCard
//    )
//    {
//        return CardService.save(id, name, marque, colorsCard,createAt);
//    }

    @POST
    @Path("/Add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Card AddCard(Card card) {
        return cardService.save(card);
    }


    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Card getCardByID(@PathParam("id") int id) {
        Card cardSelect = null;
        for (Card card : cardService.findAll()) {
            if (card.getId() == id) {
                cardSelect = card;
            }
        }
        return cardSelect;
    }

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public List<Card> findAllCard() {
        return cardService.findAll();
    }

    @GET
    @Path("/delete/{id}")
    @Produces("text/plain")
    public String deleteCard(@PathParam("id") int id) {
        return cardService.deleteCard(id);
    }

    @POST
    @Path("/update/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Card deleteCard(@PathParam("id") int id, Card card) {
        return cardService.update(id, card);
    }

}
