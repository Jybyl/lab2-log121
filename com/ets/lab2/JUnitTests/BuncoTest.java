package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuncoTest {
    Bunco bunco;
    CollectionPlayer players;
    @BeforeEach
    void setup(){
        players = new CollectionPlayer();
        Player player1 = new Player("Bob");
        Player player2 = new Player("Tim");
        players.addPlayer(player1);
        players.addPlayer(player2);

        bunco = new BuncoFactory().generateBuncoGame(players);
    }

    @Test
    void getPlayersTest(){
        for(int i = 0; i < players.getPlayerNumber(); i++){
            assertEquals(players.getPlayer(i), bunco.getPlayers().getPlayer(i));
        }
    }

    @Test
    void setPlayersTest(){
        CollectionPlayer newCollectionPlayer = new CollectionPlayer();
        newCollectionPlayer.addPlayer(new Player("Guy"));
        newCollectionPlayer.addPlayer(new Player("Jules"));
        bunco.setPlayers(newCollectionPlayer);
        for(int i = 0; i < players.getPlayerNumber(); i++){
            assertEquals(newCollectionPlayer.getPlayer(i), bunco.getPlayers().getPlayer(i));
        }
    }


    @Test
    void getBuncoRulesTest(){
        Rules rules = new Rules(players.getPlayerNumber(),3,6);
        assertEquals(bunco.getBuncoRules().getDiceLimit(), rules.getDiceLimit());
        assertEquals(bunco.getBuncoRules().getPlayerLimit(), rules.getPlayerLimit());
        assertEquals(bunco.getBuncoRules().getRoundLimit(), rules.getRoundLimit());
    }

    @Test
    void setBuncoRulesTest(){
        Rules rules = new Rules(players.getPlayerNumber()+1,4,7);
        bunco.setBuncoRules(rules);
        assertEquals(bunco.getBuncoRules().getDiceLimit(), rules.getDiceLimit());
        assertEquals(bunco.getBuncoRules().getPlayerLimit(), rules.getPlayerLimit());
        assertEquals(bunco.getBuncoRules().getRoundLimit(), rules.getRoundLimit());
    }
    @Test
    void getCurrentRoundTest(){
        assertEquals(bunco.getCurrentRound(), 1);
    }
    @Test
    void setCurrentRoundTest(){
        bunco.setCurrentRound(bunco.getCurrentRound()+1);
        assertEquals(bunco.getCurrentRound(), 2);
    }

    @Test
    void calculateWinner(){

    }

    @Test
    void calculateScoreTurnTest(){
        for(int i = 0; i < bunco.getBuncoRules().getRoundLimit(); i++){
            bunco.calculateScoreTurn();
        }
    }
}
