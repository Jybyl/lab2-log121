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
        bunco = new BuncoFactory().generateBuncoGame();
    }
}
