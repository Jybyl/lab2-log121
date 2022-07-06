package com.ets.lab2.GameFrameWork;

import com.ets.lab2.Iterator.Iterable;
import com.ets.lab2.Iterator.Iterator;

public class DiceIterator implements Iterator<Dice> {

    private CollectionDice cd;
    private int index = 0;

    public DiceIterator(CollectionDice cd){
        this.cd = cd;
    }


    public boolean hasNext(){
        return index < cd.getSize();
    }


    public Dice getNext(){
        return cd.getDice(index++);
    }
}
