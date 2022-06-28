package com.ets.lab2.GameFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPlayer {
    private ArrayList<Player> players = new ArrayList<>();
    public Iterator playerIterator;

    public void addPlayer(Player p){
        players.add(p);
    }
    public void createIterator(){
         playerIterator = players.iterator();
    }
    public int getPlayerNumber(){
        return players.size();
    }
}
