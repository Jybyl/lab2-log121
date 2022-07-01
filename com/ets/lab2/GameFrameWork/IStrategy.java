package com.ets.lab2.GameFrameWork;

public interface IStrategy {
    public Player calculateWinner(Game g);
    public Score calculateScoreTurn(Game g);
}
