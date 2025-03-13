package com.deckofcardsapi;


import static io.restassured.RestAssured.*;

public class DeckOfCardsApiPage {

    public String getDeck(int number) {
        String newShuffledDeck =
                "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=" + number;
        return get(newShuffledDeck).asString();
    }

    public String drawCards(String deckId, int number) {
        String drawDeck =
                "https://deckofcardsapi.com/api/deck/" + deckId + "/draw/?count=" + number;
        return get(drawDeck).asString();
    }
}