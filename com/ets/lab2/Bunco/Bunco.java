package com.ets.lab2.Bunco;

import com.ets.lab2.GameFrameWork.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Bunco extends GameTemplate implements IStrategy{
    private Rules buncoRules;
    private int currentRound;

    public Bunco(int playerLimit, int diceLimit, int roundLimit){
        super();
        this.buncoRules = new Rules(playerLimit,diceLimit,roundLimit);
        this.currentRound = 1;
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
        Player[] sortedPlayers = new Player[this.getBuncoRules().getPlayerLimit()];
        CollectionPlayer players = this.getPlayers();
        PlayerIterator pIterator = players.createIterator();
        int index = 0;
        while(pIterator.hasNext()){
            Player p = pIterator.getNext();
            sortedPlayers[index] = p;
            System.out.println(p.getName()+" got "+p.getScore().getPoints()+" points");
            ++index;
        }
        return sortedPlayers;
    }

    /**
     * Calcule le score des joueurs selon les nouvelles valeurs des dés et retourne le nouveau classement des joueurs.
     * @return le nouveau classement des joueurs
     */
    @Override
    public Player[] calculateScoreTurn() {
        System.out.println("***********ROUND " + this.getCurrentRound() + "***********");
        CollectionPlayer players = this.getPlayers();
        PlayerIterator pIterator = players.createIterator();
        while(pIterator.hasNext()){
             Player p = pIterator.getNext();
             int pRoundPoint = 0;
             System.out.println(p.getName());
             boolean continueTurn = true;
             while(continueTurn){
                 ArrayList<Integer> rollNumbers = p.rollDice(this.getDie());
                 boolean sameValues = true;
                 for(Integer number : rollNumbers){
                     if(!number.equals(rollNumbers.get(0))) sameValues = false;
                 }
                 if(!sameValues){
                     int turnPoints = 0;
                     for(int i = 0; i < rollNumbers.size(); i++){
                         int rollNumber = rollNumbers.get(i);
                         System.out.println(rollNumber);

                         //Même chiffre que le nombre du tour actuel
                         if(rollNumber == this.getCurrentRound()){
                             ++pRoundPoint;
                             ++turnPoints;
                         }
                     }
                     //Aucun chiffre correspond au tour
                     if(turnPoints == 0) continueTurn = false;
                 }
                 else{
                     //BUNCO!!
                     if(rollNumbers.get(0) == this.getCurrentRound()){
                         pRoundPoint += 21;
                         continueTurn = false;
                         System.out.println("BUNCO!!!");
                     }
                     //Mêmes chiffres, mais ne correspondent pas au tour
                     else{
                         pRoundPoint += 5;
                         System.out.println("ALMOST BUNCO");
                     }
                 }
                 System.out.println("*****");
             }
             System.out.println("Points earned this turn: "+pRoundPoint);
             p.getScore().calculateScore(pRoundPoint);
        }

        this.setCurrentRound(this.getCurrentRound()+1);
        return this.calculateWinner();
    }

}
