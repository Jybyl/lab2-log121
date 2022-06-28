package com.ets.lab2.JUnitTests;

import com.ets.lab2.GameFrameWork.Dice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceTest {

    Dice dice;
    @BeforeEach
    void setUp(){
        dice = new Dice(6);
    }
    @Test
    void DiceTest(){
        Dice dice = new Dice(6);
        assertEquals(dice.getSides(), 6);
    }
    @Test
    @DisplayName("Roll Test")
    void roll(){
        int rollNumber = dice.roll();
        assertTrue(rollNumber<= 6);
        assertTrue(rollNumber>= 1);
//        System.out.println(rollNumber);
    }
    @Test
    @DisplayName("Dice Getter Test")
    void getSidesTest(){
        dice.setSides(6);
        assertEquals(dice.getSides(), 6);
    }
    @DisplayName("Dice Setter Test")
    @Test
    void setSidesTest(){
        dice.setSides(6);
        int result = dice.getSides();
        assertEquals(result, 6);
    }
}
