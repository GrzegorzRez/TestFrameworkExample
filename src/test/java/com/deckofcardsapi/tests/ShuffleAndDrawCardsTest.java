package com.deckofcardsapi.tests;


import com.deckofcardsapi.DeckOfCardsApiPage;
import org.testng.annotations.Test;

import static io.restassured.path.json.JsonPath.*;

public class ShuffleAndDrawCardsTest {

    @Test
    public void shuffleAndDrawCardsTest() {
        DeckOfCardsApiPage deckOfCardsApiPage = new DeckOfCardsApiPage();
        String deck = deckOfCardsApiPage.getDeck(1);
        String deckId = from(deck).getString("deck_id");
        System.out.println(deckOfCardsApiPage.drawCards(deckId,3));

    }
}
