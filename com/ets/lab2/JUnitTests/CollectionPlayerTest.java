package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.CollectionPlayer;
import com.ets.lab2.GameFrameWork.Player;
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
        bunco = new BuncoFactory().generateBuncoGame(collectionPlayer);
        assertNotEquals(collectionPlayer.playerIterator, null);
    }
}
