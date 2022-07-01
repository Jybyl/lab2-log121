package com.ets.lab2.Bunco;

public class BuncoFactory {
    public Bunco generateBuncoGame(){
        Bunco b = new Bunco(2, 1, 5, 3);
        return b;
    }
}
