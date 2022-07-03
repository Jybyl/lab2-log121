package com.ets.lab2.GameFrameWork;

import java.util.Iterator;

public class Game extends GameTemplate implements IStrategy{
    private int currentRound;
    private int rounds;
    private Rules ruleset;

    public Game(int rounds, int playerLimit, int diceLimit, int roundLimit, int pointLimit){
        this.currentRound = 0;
        this.rounds = rounds;
        this.ruleset = new Rules(playerLimit,diceLimit,roundLimit,pointLimit);
    }

    public Rules getRuleset() {
        return ruleset;
    }

    public void setRuleset(Rules ruleset) {
        this.ruleset = ruleset;
    }

    @Override
    public Player calculateWinner() {
        CollectionPlayer players = this.getPlayers();
        players.createIterator();
        Iterator<Player> it = players.playerIterator;
        Player currWinner = new Player("unknown");
        if(it.hasNext()) currWinner = it.next();
        while(it.hasNext()){
            Player nextPlayer = it.next();
            if(currWinner.getScore().getPoints() < nextPlayer.getScore().getPoints()) currWinner = nextPlayer;
        }
        return currWinner;
    }

    @Override
    public Score calculateScoreTurn(Game g){
        return null;
    }

    public void setRules(int rounds, int playerLimit, int diceLimit, int roundLimit, int pointLimit){
        this.ruleset = new Rules(playerLimit,diceLimit,roundLimit,pointLimit);
    }
}
