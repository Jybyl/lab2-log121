package com.ets.lab2.GameFrameWork;

import com.ets.lab2.Iterator.Iterable;
import com.ets.lab2.Iterator.Iterator;

public class DiceIterator implements Iterator<Dice> {

    private CollectionDice cd;
    private int index = 0;

    public DiceIterator(CollectionDice cd){
        this.cd = cd;
    }

    /**
     * Vérifie si il y a un prochain élément dans la suite à itérer.
     * @return true: Si il y a un prochain élément. false: Si il y en a pas.
     */
    public boolean hasNext(){
        return index < cd.getSize();
    }

    /**
     * Retourne le prochain élément dans la suite à itérer.
     * @return le prochain élément
     */
    public Dice getNext(){
        return cd.getDice(index++);
    }
}
