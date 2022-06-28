package com.ets.lab2.JUnitTests;

import com.ets.lab2.GameFrameWork.Player;
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

    void getScore(){

    }
    void setScore(){

    }
}
