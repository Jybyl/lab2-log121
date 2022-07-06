package com.ets.lab2.GameFrameWork;

import java.util.Iterator;

public class Game extends GameTemplate implements IStrategy{
    private int currentRound;
    private int rounds;
    private Rules ruleset;

    public Game(int rounds, int playerLimit, int diceLimit, int roundLimit){
        this.currentRound = 0;
        this.rounds = rounds;
        this.ruleset = new Rules(playerLimit,diceLimit,roundLimit);
    }

    /**
     * Retourne les règles du jeu.
     * @return les règles du jeu
     */
    public Rules getRuleset() {
        return ruleset;
    }

    /**
     * Modifie les règles du jeu aux règles spécifiées.
     * @param ruleset les nouvelles règles
     */
    public void setRuleset(Rules ruleset) {
        this.ruleset = ruleset;
    }

    /**
     * Retourne un tableau des joueurs selon un ordre décroissant de scores.
     * @return un tableau des joueurs selon un ordre décroissant de scores
     */
    @Override
    public Player[] calculateWinner() {
//        CollectionPlayer players = this.getPlayers();
//        players.createIterator();
//        Iterator<Player> it = players.playerIterator;
//        Player currWinner = new Player("unknown");
//        if(it.hasNext()) currWinner = it.next();
//        while(it.hasNext()){
//            Player nextPlayer = it.next();
//            if(currWinner.getScore().getPoints() < nextPlayer.getScore().getPoints()) currWinner = nextPlayer;
//        }
        Player[] winners = {new Player("dawd")};
        return winners;
    }

    /**
     * Calcule le score des joueurs selon les nouvelles valeurs des dés.
     * @return ????????????
     */
    @Override
    public void calculateScoreTurn(){

    }
}
