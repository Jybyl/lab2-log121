package com.ets.lab2.GameFrameWork;

import java.util.ArrayList;
import com.ets.lab2.Iterator.Iterable;

public class CollectionDice implements Iterable<Dice>{
    private ArrayList<Dice> dies;

    public CollectionDice(){
        dies = new ArrayList<Dice>();
    }

    public void addDice(Dice d){
        dies.add(d);
    }
    public Dice getDice(int index){
        return dies.get(index);
    }

    public int getSize(){
        return dies.size();
    }
    @Override
    public DiceIterator createIterator(){
        return new DiceIterator(this);
    }
}
