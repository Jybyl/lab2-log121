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
    void testConstructor(){
        assertEquals(bunco.getCurrentRound(),1);
        assertEquals(bunco.getRuleset().getRoundLimit(),6);
        assertEquals(bunco.getRuleset().getDiceLimit(),3);
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
    void getRulesetTest(){
        Rules rules = new Rules(players.getPlayerNumber(),3,6);
        assertEquals(bunco.getRuleset().getDiceLimit(), rules.getDiceLimit());
        assertEquals(bunco.getRuleset().getPlayerLimit(), rules.getPlayerLimit());
        assertEquals(bunco.getRuleset().getRoundLimit(), rules.getRoundLimit());
    }

    @Test
    void setBuncoRulesTest(){
        Rules rules = new Rules(players.getPlayerNumber()+1,4,7);
        bunco.setRuleset(rules);
        assertEquals(bunco.getRuleset().getDiceLimit(), rules.getDiceLimit());
        assertEquals(bunco.getRuleset().getPlayerLimit(), rules.getPlayerLimit());
        assertEquals(bunco.getRuleset().getRoundLimit(), rules.getRoundLimit());
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
        Player p1 = new Player("Bob");
        p1.setScore(24);
        Player p2 = new Player("Tim");
        p2.setScore(30);
        Player p3 = new Player("Joe");
        p3.setScore(25);
        CollectionPlayer cp = new CollectionPlayer();
        cp.addPlayer(p1);
        cp.addPlayer(p2);
        cp.addPlayer(p3);

        bunco = new BuncoFactory().generateBuncoGame(cp);
        Player[] winners = bunco.calculateWinner();
        for(Player winner : winners){
            System.out.println(winner.getName()+" - "+winner.getScore().getPoints());
        }

        assertEquals(winners[0],p2);
    }

    @Test
    void calculateScoreTurnTest(){
        for(int i = 0; i < bunco.getRuleset().getRoundLimit(); i++){
            bunco.calculateScoreTurn();
        }
        int finalRound = bunco.getCurrentRound();
        assertEquals(7,finalRound);
    }
}
