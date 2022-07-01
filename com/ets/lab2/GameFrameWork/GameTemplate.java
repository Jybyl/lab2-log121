package com.ets.lab2.GameFrameWork;

public abstract class GameTemplate {
    private CollectionPlayer players;
    private int rounds;

    public abstract Player calculateWinner(Game g);
    public abstract Score calculateScoreTurn(Game g);
}
