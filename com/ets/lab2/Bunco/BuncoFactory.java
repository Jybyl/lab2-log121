package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.*;

public class BuncoFactory {
    /**
     * Génère une instance de Bunco avec ses dés et ses joueurs.
     * @param cp une collection de joueurs
     * @return une instance de Bunco
     */
    public Bunco generateBuncoGame(CollectionPlayer cp){
        Bunco b = new Bunco(cp.getPlayerNumber(), 3, 6);
        b.setPlayers(cp);
        DiceFactory df = new DiceFactory();
        CollectionDice die = df.generateDice();
        for(int i = 0; i < b.getRuleset().getDiceLimit(); i++){
            die.addDice(new Dice(b.getRuleset().getRoundLimit()));
        }
        die.createIterator();
        cp.createIterator();
        b.setDie(die);
        return b;
    }
}
