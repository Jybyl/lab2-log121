package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    Game game;

    @BeforeEach
    void setup(){
        game = new Game(2, 1, 5);
    }

    @Test
    void testConstructor(){
        assertTrue(game.getRuleset().getRoundLimit() == 5);
        assertTrue(game.getRuleset().getPlayerLimit() == 2);
        assertTrue(game.getRuleset().getPlayerLimit() == 2);
    }

    @Test
    void calculateGameWinner(){
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

        game = new GameFactory().generateGame(cp,1,1);
        Player[] winners = game.calculateWinner();
        for(Player winner : winners){
            System.out.println(winner.getName()+" - "+winner.getScore().getPoints());
        }

        assertEquals(winners[0],p2);
    }

    @Test
    void calculateScoreTurn(){

    }
}
