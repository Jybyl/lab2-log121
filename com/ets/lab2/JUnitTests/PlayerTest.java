package com.ets.lab2.JUnitTests;

import com.ets.lab2.GameFrameWork.Player;
import com.ets.lab2.GameFrameWork.Score;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {

    Player player;
    @BeforeEach
    void setUp(){
        player = new Player("bob");
        Score score = new Score(0);
    }

    @Test
    @DisplayName("Player roll test")
    void rollDice(){
        int rollNumber = player.rollDice();
        assertTrue(rollNumber<= 6);
        assertTrue(rollNumber>= 1);
    }
    @Test
    void getName(){
        player.setName("Player1");
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
