package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.CollectionPlayer;
import com.ets.lab2.GameFrameWork.Player;
import com.ets.lab2.GameFrameWork.PlayerIterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionPlayerTest {

    CollectionPlayer collectionPlayer;
    Bunco bunco;

    @BeforeEach
    void setUp(){
        collectionPlayer = new CollectionPlayer();
    }

    @Test
    void getPlayer(){
        collectionPlayer.addPlayer(new Player("Bob"));
        Player p2 = new Player("Jim");
        collectionPlayer.addPlayer(p2);
        assertEquals(p2,collectionPlayer.getPlayer(1));
    }

    @Test
    void getPlayerNumber(){
        collectionPlayer.addPlayer(new Player("Bob"));
        collectionPlayer.addPlayer(new Player("Tim"));
        collectionPlayer.addPlayer(new Player("Joe"));
        assertEquals(collectionPlayer.getPlayerNumber(),3);
    }

    @Test
    void testAddPlayer(){
        Player p = new Player("P");
        int sizeBefore = collectionPlayer.getPlayerNumber();
        collectionPlayer.addPlayer(p);
        int sizeAfter = collectionPlayer.getPlayerNumber();
        assertTrue(sizeAfter > sizeBefore);
    }

    @Test
    void testIterator(){
        Player p = new Player("P");
        Player p1 = new Player("P1");
        collectionPlayer.addPlayer(p);
        collectionPlayer.addPlayer(p1);
        PlayerIterator iterator = collectionPlayer.createIterator();
        bunco = new BuncoFactory().generateBuncoGame(collectionPlayer);
        assertNotEquals(iterator, null);
    }
}
