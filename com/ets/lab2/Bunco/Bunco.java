package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.*;

public class Bunco extends GameTemplate {
    private Rules buncoRules;

    public Bunco(int playerLimit, int diceLimit, int roundLimit, int pointLimit){
        this.buncoRules = new Rules(playerLimit,diceLimit,roundLimit,pointLimit);
    }

    public Rules getBuncoRules() {
        return buncoRules;
    }

    public void setBuncoRules(Rules buncoRules) {
        this.buncoRules = buncoRules;
    }

    @Override
    public Player calculateWinner(Game g) {
        return null;
    }

    @Override
    public Score calculateScoreTurn(Game g) {
        return null;
    }
}
