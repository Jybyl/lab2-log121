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

    /**
     * Retourne une collection de joueurs.
     * @return une collection de joueurs
     */
    public CollectionPlayer getPlayers(){
        return super.getPlayers();
    }

    /**
     * Retourne les règles du jeu.
     * @return les règles du jeu
     */
    public Rules getBuncoRules() {
        return buncoRules;
    }

    /**
     * Modifie les règles du jeu aux règles spécifiées.
     * @param buncoRules les nouvelles règles
     */
    public void setBuncoRules(Rules buncoRules) {
        this.buncoRules = buncoRules;
    }

    /**
     * Retourne le nombre du tour actuel.
     * @return le nombre du tour actuel
     */
    public int getCurrentRound() {
        return currentRound;
    }

    /**
     * Modifie le nombre du tour actuel du jeu au tour spécifié.
     * @param currentRound le tour spécifié
     */
    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
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
