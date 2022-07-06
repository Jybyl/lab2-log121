package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.CollectionDice;
import com.ets.lab2.GameFrameWork.CollectionPlayer;
import com.ets.lab2.GameFrameWork.Dice;
import com.ets.lab2.GameFrameWork.Rules;

public class BuncoFactory {
    /**
     * Génère une instance de Bunco avec ses dés et ses joueurs.
     * @param cp une collection de joueurs
     * @return une instance de Bunco
     */
    public Bunco generateBuncoGame(CollectionPlayer cp){
        Bunco b = new Bunco(cp.getPlayerNumber(), 3, 6);
        b.setPlayers(cp);
        CollectionDice die = new CollectionDice();
        for(int i = 0; i < b.getBuncoRules().getDiceLimit(); i++){
            die.addDice(new Dice(b.getBuncoRules().getRoundLimit()));
        }
        die.createIterator();
        cp.createIterator();
        b.setDie(die);
        return b;
    }
}
