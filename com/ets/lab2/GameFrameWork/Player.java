package com.ets.lab2.GameFrameWork;
import java.util.ArrayList;

import static com.ets.lab2.GameFrameWork.CollectionDice.diceIterator;
public class Player {
    private String name;
    private Score score;

    public Player(String name) {
        this.name = name;
        this.score = new Score(0);
    }

    public ArrayList<Integer> rollDice(){
        ArrayList<Integer> playerRolls = new ArrayList<>();
        while(diceIterator.hasNext()){
            Dice dice = diceIterator.next();
            playerRolls.add(dice.roll());
        }
        return playerRolls;
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

    public void setScore(int points) {
        score.setPoints(points);
    }
}
