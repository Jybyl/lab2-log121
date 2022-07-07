package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionDiceTest {

    CollectionDice cd;

    @BeforeEach
    void setUp(){
        cd = new CollectionDice();
    }

    @Test
    void addDice(){
        cd.addDice(new Dice(6));
        assertTrue(cd.getSize()>0);
    }

    @Test
    void getDice(){
        cd.addDice(new Dice(6));
        cd.addDice(new Dice(5));
        assertEquals(new Dice(5).getSides(),cd.getDice(1).getSides());
    }

    @Test
    void getSize(){
        cd.addDice(new Dice(6));
        cd.addDice(new Dice(6));
        cd.addDice(new Dice(6));
        assertTrue(cd.getSize() == 3);
    }

    @Test
    void testIterator(){
        Dice p = new Dice(6);
        Dice p1 = new Dice(6);
        cd.addDice(p);
        cd.addDice(p1);
        DiceIterator iterator = cd.createIterator();
        assertNotEquals(iterator, null);
    }
}
