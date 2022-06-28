package com.ets.lab2.GameFrameWork;

import java.util.Random;

public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll(){
        Random r = new Random();
        int rollNumber = r.nextInt(6-1+1) + 1;
        return rollNumber;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
