package com.ets.lab2.GameFrameWork;

public interface IStrategy {
    public Player[] calculateWinner();
    public void calculateScoreTurn();
    public Rules getRuleset();
}
