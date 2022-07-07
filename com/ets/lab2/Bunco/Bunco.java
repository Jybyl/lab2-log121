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
    @Override
    public Rules getRuleset() {
        return buncoRules;
    }

    /**
     * Modifie les règles du jeu aux règles spécifiées.
     * @param buncoRules les nouvelles règles
     */
    public void setRuleset(Rules buncoRules) {
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

    private void sortPlayerArr(Player[] ps){
            int n = ps.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++){
                    if (ps[j].getScore().getPoints() < ps[j + 1].getScore().getPoints()) {
                        Player temp = ps[j];
                        ps[j] = ps[j + 1];
                        ps[j + 1] = temp;
                    }
                }
    }

    /**
     * Retourne un tableau des joueurs selon un ordre décroissant de scores.
     * @return un tableau des joueurs selon un ordre décroissant de scores
     */
    @Override
    public Player[] calculateWinner() {
        Player[] sortedPlayers = new Player[this.getRuleset().getPlayerLimit()];
        CollectionPlayer players = this.getPlayers();
        PlayerIterator pIterator = players.createIterator();
        int index = 0;
        while(pIterator.hasNext()){
            Player p = pIterator.getNext();
            sortedPlayers[index] = p;
            ++index;
        }
        sortPlayerArr(sortedPlayers);
        return sortedPlayers;
    }

    /**
     * Calcule le score des joueurs selon les nouvelles valeurs des dés pour le tour actuel.
     */
    @Override
    public void calculateScoreTurn() {
        System.out.println("***********TOUR " + this.getCurrentRound() + "***********");
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
                         System.out.println("BUNCO!!! +21");
                     }
                     //Mêmes chiffres, mais ne correspondent pas au tour
                     else{
                         pRoundPoint += 5;
                         System.out.println("PRESQUE BUNCO +5");
                     }
                 }
                 System.out.println("*****");
             }
             System.out.println("Nombre de points obtenus par "+p.getName()+": "+pRoundPoint);
             p.getScore().calculateScore(pRoundPoint);
             System.out.println("-----");
        }

        this.setCurrentRound(this.getCurrentRound()+1);
    }
}
