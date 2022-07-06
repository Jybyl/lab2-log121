package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.CollectionDice;
import com.ets.lab2.GameFrameWork.CollectionPlayer;
import com.ets.lab2.GameFrameWork.Dice;
import com.ets.lab2.GameFrameWork.Rules;

public class BuncoFactory {
    public Bunco generateBuncoGame(CollectionPlayer cp){
        Bunco b = new Bunco(cp.getPlayerNumber(), 3, 6);
        b.setPlayers(cp);
        CollectionDice die = new CollectionDice();
        for(int i = 0; i < b.getBuncoRules().getDiceLimit(); i++){
            die.addDice(new Dice(b.getBuncoRules().getRoundLimit()));
        }
        die.createDiceIterator();
        cp.createIterator();
        b.setDie(die);
        return b;
    }
}
