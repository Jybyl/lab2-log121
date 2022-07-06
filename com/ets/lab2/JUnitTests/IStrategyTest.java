package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.CollectionPlayer;
import com.ets.lab2.GameFrameWork.Game;
import com.ets.lab2.GameFrameWork.IStrategy;
import com.ets.lab2.GameFrameWork.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IStrategyTest {
    Game game;
    Bunco bunco;

    @BeforeEach
    void setup(){
        game = new Game(5, 2, 1, 5);
        bunco = new BuncoFactory().generateBuncoGame(new CollectionPlayer());
    }

    @Test
    void calculateGameWinner(){
        Player p1 = new Player("bob");
        p1.setScore(2);

        Player p2 = new Player("joe");
        p2.setScore(5);

        CollectionPlayer players = new CollectionPlayer();
        players.addPlayer(p1);
        players.addPlayer(p2);
        game.setPlayers(players);

//        assertEquals(game.calculateWinner().getName(),"joe");
    }

    @Test
    void calculateBuncoWinner(){
        Player p1 = new Player("bob");
        p1.setScore(2);

        Player p2 = new Player("joe");
        p2.setScore(5);

        Player p3 = new Player("jay");
        p3.setScore(1);

        CollectionPlayer players = new CollectionPlayer();
        players.addPlayer(p1);
        players.addPlayer(p2);
        players.addPlayer(p3);
        bunco.setPlayers(players);

//        assertEquals(bunco.calculateWinner().getName(),"joe");
    }

    @Test
    void calculateScoreTurn(){

    }
}
