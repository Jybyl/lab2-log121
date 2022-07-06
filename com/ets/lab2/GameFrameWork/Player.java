package com.ets.lab2.GameFrameWork;
import java.util.ArrayList;


public class Player implements Comparable<Player>{
    private String name;
    private Score score;

    public Player(String name) {
        this.name = name;
        this.score = new Score(0);
    }

    /**
     * Cette méthode attribue une valeur aléatoire entre 1 et le nombre de côtés du dé
     * @param
     * @return
     */
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

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(int points) {
        score.setPoints(points);
    }

    @Override
    public int compareTo(Player o) {
        int comparison = 0;
        if(score.getPoints() < o.getScore().getPoints()) comparison = -1;
        else if(score.getPoints() > o.getScore().getPoints()) comparison = 1;
        else comparison = 0;

        return comparison;
    }
}
