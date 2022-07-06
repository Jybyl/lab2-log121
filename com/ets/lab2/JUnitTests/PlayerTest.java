package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {

    Player player;
    Bunco bunco;
    CollectionDice die;
    @BeforeEach
    void setUp(){
        BuncoFactory buncoFactory = new BuncoFactory();
        DiceFactory diceFactory = new DiceFactory();
        player = new Player("bob");
        die = diceFactory.generateDice();
        bunco = buncoFactory.generateBuncoGame(new CollectionPlayer());
        die.addDice(new Dice(6));
        die.addDice(new Dice(6));
        die.addDice(new Dice(6));
        Score score = new Score(0);
    }

    @Test
    @DisplayName("Player roll test")
    void rollDice(){
        ArrayList<Integer> rollNumbers = player.rollDice(die);
        for(int i = 0; i < rollNumbers.size(); i++){
            int rollNumber = rollNumbers.get(i);
            System.out.println(rollNumber);
            assertTrue(rollNumber<= 6);
            assertTrue(rollNumber>= 1);
        }
    }
    @Test
    void getName(){
        player.setName("Player1");
        System.out.println(player.getName());
        assertEquals(player.getName(), "Player1");
    }
    @Test
    void setName(){
        player.setName("Player1");
        String name = player.getName();
        assertEquals(name, "Player1");
    }
    @Test
    void getScore(){


        assertEquals(player.getScore().getPoints(), 0);
    }
    @Test
    void setScore(){
        player.setScore(7);
        assertEquals(player.getScore().getPoints(), 7);
    }
}
