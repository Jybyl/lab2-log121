package com.ets.lab2.GameFrameWork;

import com.ets.lab2.Iterator.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPlayer implements Iterable<Player> {
    private ArrayList<Player> players = new ArrayList<>();


    /**
     * Ajoute un joueur dans players.
     * @param p le joueur à ajouter
     */
    public void addPlayer(Player p){
        players.add(p);
    }

    /**
     * Retourne un joueur selon sa position dans players.
     * @param index Index du joueur recherché
     * @return le joueur à la position indiquée
     */
    public Player getPlayer(int index){
        return players.get(index);
    }

    /**
     * Crée et retourne une instance de l'itérateur PlayerIterator.
     * @return itérateur PlayerIterator
     */
    @Override
    public PlayerIterator createIterator(){

        return new PlayerIterator(this);
    }

    /**
     * Retourne la longueur de players.
     * @return longueur de players
     */
    public int getPlayerNumber(){
        return players.size();
    }
}
