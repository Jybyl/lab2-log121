package com.ets.lab2.GameFrameWork;

public class Player {
    private String name;
    private Score score;

    public Player(String name) {
        this.name = name;
    }

    public int rollDice(){
        Dice dice = new Dice(6);
        return dice.roll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
