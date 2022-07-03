package com.ets.lab2.GameFrameWork;

public class Rules {
    private int playerLimit;
    private int diceLimit;
    private int roundLimit;
    private int pointLimit;

    public Rules(int playerLimit, int diceLimit, int roundLimit, int pointLimit) {
        this.playerLimit = playerLimit;
        this.diceLimit = diceLimit;
        this.roundLimit = roundLimit;
        this.pointLimit = pointLimit;
    }

    public int getPlayerLimit() {
        return playerLimit;
    }

    public void setPlayerLimit(int playerLimit) {
        this.playerLimit = playerLimit;
    }

    public int getDiceLimit() {
        return diceLimit;
    }

    public void setDiceLimit(int diceLimit) {
        this.diceLimit = diceLimit;
    }

    public int getRoundLimit() {
        return roundLimit;
    }

    public void setRoundLimit(int roundLimit) {
        this.roundLimit = roundLimit;
    }

    public int getPointLimit() {
        return pointLimit;
    }

    public void setPointLimit(int pointLimit) {
        this.pointLimit = pointLimit;
    }
}
