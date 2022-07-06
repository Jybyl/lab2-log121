package com.ets.lab2.GameFrameWork;

public abstract class GameTemplate {
    private CollectionPlayer players;
    private CollectionDice die;

    public abstract Player[] calculateWinner();
    public CollectionPlayer getPlayers(){
        return players;
    }
    public CollectionDice getDie(){
        return die;
    }

    public void setPlayers(CollectionPlayer players) {
        this.players = players;
    }
    public void setDie(CollectionDice die) {
        this.die = die;
    }
}
