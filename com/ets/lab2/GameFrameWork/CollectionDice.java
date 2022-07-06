package com.ets.lab2.GameFrameWork;

import java.util.ArrayList;
import com.ets.lab2.Iterator.Iterable;

public class CollectionDice implements Iterable<Dice>{
    private ArrayList<Dice> dies;

    public CollectionDice(){
        dies = new ArrayList<Dice>();
    }

    /**
     * Ajoute un dé dans dies.
     * @param d le dé à ajouter
     */
    public void addDice(Dice d){
        dies.add(d);
    }

    /**
     * Retourne un dé selon sa position dans dies.
     * @param index Index du dé recherché
     * @return le dé à la position indiquée
     */
    public Dice getDice(int index){
        return dies.get(index);
    }

    /**
     * Retourne la longueur de dies.
     * @return longueur de dies
     */
    public int getSize(){
        return dies.size();
    }

    /**
     * Crée et retourne une instance de l'itérateur DiceIterator.
     * @return itérateur DiceIterator
     */
    @Override
    public DiceIterator createIterator(){
        return new DiceIterator(this);
    }
}
