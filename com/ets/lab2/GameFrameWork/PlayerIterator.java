package com.ets.lab2.GameFrameWork;

import com.ets.lab2.Iterator.Iterator;

public class PlayerIterator implements Iterator<Player> {

    private CollectionPlayer cp;
    private int index = 0;

    public PlayerIterator(CollectionPlayer cp){
        this.cp= cp;
    }

    @Override
    public boolean hasNext() {
        return index < cp.getPlayerNumber();
    }

    @Override
    public Player getNext() {
        return cp.getPlayer(index++);
    }
}
