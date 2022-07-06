package com.ets.lab2.GameFrameWork;

public interface IStrategy {
    public Player[] calculateWinner();
    public Score calculateScoreTurn();
}
