package com.ets.lab2.Bunco;

public class BuncoFactory {
    public Bunco generateBuncoGame(){
        Bunco b = new Bunco(5, 3, 6, 3);
        return b;
    }
}
