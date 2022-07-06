package com.ets.lab2.GameFrameWork;

import com.ets.lab2.Iterator.Iterator;

public class PlayerIterator implements Iterator<Player> {

    private CollectionPlayer cp;
    private int index = 0;

    public PlayerIterator(CollectionPlayer cp){
        this.cp= cp;
    }

    /**
     * Vérifie si il y a un prochain élément dans la suite à itérer.
     * @return true: Si il y a un prochain élément. false: Si il y en a pas.
     */
    @Override
    public boolean hasNext() {
        return index < cp.getPlayerNumber();
    }

    /**
     * Retourne le prochain élément dans la suite à itérer.
     * @return le prochain élément
     */
    @Override
    public Player getNext() {
        return cp.getPlayer(index++);
    }
}
