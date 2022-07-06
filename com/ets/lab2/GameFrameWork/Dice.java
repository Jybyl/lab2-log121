package com.ets.lab2.GameFrameWork;

import java.util.Random;

public class Dice implements Comparable<Dice>{
    private int sides;
    private int value;

    public Dice(int sides) {
        this.sides = sides;
    }

    /**
     *
     * @return
     */
    public int roll(){
        Random r = new Random();
        value = r.nextInt(6) + 1;
        return value;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Dice o) {
        int comparison = 0;
        if(value < o.getValue()) comparison = -1;
        else if(value > o.getValue()) comparison = 1;
        else comparison = 0;

        return comparison;
    }
}
