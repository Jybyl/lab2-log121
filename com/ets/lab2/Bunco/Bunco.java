package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.*;

import java.util.ArrayList;
import java.util.Iterator;

import static com.ets.lab2.GameFrameWork.CollectionPlayer.playerIterator;

public class Bunco extends GameTemplate implements IStrategy{
    private Rules buncoRules;
    private int currentRound;

    public Bunco(int playerLimit, int diceLimit, int roundLimit){
        super();
        this.buncoRules = new Rules(playerLimit,diceLimit,roundLimit);
        this.currentRound = 0;
    }

    public CollectionPlayer getPlayers(){
        return super.getPlayers();
    }

    public Rules getBuncoRules() {
        return buncoRules;
    }

    public void setBuncoRules(Rules buncoRules) {
        this.buncoRules = buncoRules;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }

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

    @Override
    public Score calculateScoreTurn() {
        CollectionPlayer players = this.getPlayers();
        Player p = null;
        while(playerIterator.hasNext()){
             p = playerIterator.next();
        }
        ArrayList<Integer> rollNumbers = p.rollDice();
        for(int i = 0; i < rollNumbers.size(); i++){
            int rollNumber = rollNumbers.get(i);
            System.out.println(rollNumber);
        }
        return null;
    }

}
