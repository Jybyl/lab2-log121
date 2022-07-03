package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.*;

import java.util.Iterator;

public class Bunco extends GameTemplate{
    private Rules buncoRules;

    public Bunco(int playerLimit, int diceLimit, int roundLimit, int pointLimit){
        super();
        this.buncoRules = new Rules(playerLimit,diceLimit,roundLimit,pointLimit);
    }

    public CollectionPlayer getPlayers(){
        return super.getPlayers();
    }

    public void setPlayers(CollectionPlayer players){
        super.setPlayers(players);
    }

    public Rules getBuncoRules() {
        return buncoRules;
    }

    public void setBuncoRules(Rules buncoRules) {
        this.buncoRules = buncoRules;
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
    public Score calculateScoreTurn(Game g) {
        return null;
    }
}
