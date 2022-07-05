package com.ets.lab2.GameFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDice {
    private ArrayList<Dice> dies;
    public static Iterator diceIterator;

    public CollectionDice(){
        dies = new ArrayList<>();

    }
    public void addDice(){

        Dice dice = new Dice(6);
        dies.add(dice);
    }
    public void createDiceIterator(){
        if(!dies.isEmpty()) {
            diceIterator = dies.iterator();
        }
    }
}
