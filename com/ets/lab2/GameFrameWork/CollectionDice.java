package com.ets.lab2.GameFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDice {
    private ArrayList<Dice> dies = new ArrayList<>();
    public static Iterator<Dice> diceIterator;


    public void addDice(Dice d){
        dies.add(d);
    }
    public void createDiceIterator(){
        if(!dies.isEmpty()) {
            System.out.println("Created iterator");
            diceIterator = dies.iterator();
        }
    }

}
