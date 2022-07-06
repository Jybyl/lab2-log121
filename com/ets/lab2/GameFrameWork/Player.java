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
     * Retourne une liste des valeurs des dés lancés.
     * @return une liste des valeurs des dés lancés
     */
    public ArrayList<Integer> rollDice(){
        ArrayList<Integer> playerRolls = new ArrayList<>();
        while(diceIterator.hasNext()){
            Dice dice = diceIterator.next();
            playerRolls.add(dice.roll());
        }
        return playerRolls;
    }

    /**
     * Retourne le nom du joueur.
     * @return le nom du joueur
     */
    public String getName() {
        return name;
    }

    /**
     * Modifie le nom du joueur au nom du joueur spécifié.
     * @param name le nom spécifié
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourne le score du joueur.
     * @return le score du joueur
     */
    public Score getScore() {
        return score;
    }

    /**
     * Modifie le score du joueur au score du joueur spécifié.
     * @param points le score du joueur spécifié
     */
    public void setScore(int points) {
        score.setPoints(points);
    }

    /**
     * Compare le score de ce joueur avec celui d'un autre.
     * @param o le joueur à comparer
     * @return -1: Si ce joueur à un score inférieur au deuxième. 1: Si ce joueur à un score supérieur au deuxième. 0: Si les scores sont égaux.
     */
    @Override
    public int compareTo(Player o) {
        int comparison = 0;
        if(score.getPoints() < o.getScore().getPoints()) comparison = -1;
        else if(score.getPoints() > o.getScore().getPoints()) comparison = 1;
        else comparison = 0;

        return comparison;
    }
}
