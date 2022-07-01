package com.ets.lab2.GameFrameWork;

public abstract class GameTemplate {
    private CollectionPlayer players;
    private int rounds;

    public abstract Player calculateWinner();
    public abstract Score calculateScoreTurn(Game g);
    public CollectionPlayer getPlayers(){
        return players;
    }

    public void setPlayers(CollectionPlayer players) {
        this.players = players;
    }
}
