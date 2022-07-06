package com.ets.lab2.JUnitTests;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.CollectionPlayer;
import com.ets.lab2.GameFrameWork.Game;
import com.ets.lab2.GameFrameWork.IStrategy;
import com.ets.lab2.GameFrameWork.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuncoTest {
    Bunco bunco;

    @BeforeEach
    void setup(){
        Player player1 = new Player("Bob");
        Player player2 = new Player("Tim");
        bunco = new BuncoFactory().generateBuncoGame(new CollectionPlayer());
    }

    @Test
    void getPlayersTest(){

    }

    @Test
    void setPlayersTest(){

    }


    @Test
    void getBuncoRulesTest(){

    }

    @Test
    void setBuncoRulesTest(){

    }
    @Test
    void getCurrentRoundTest(){

    }
    @Test
    void setCurrentRoundTest(){

    }

    @Test
    void calculateScoreTurnTest(){

    }
}
