package com.ets.lab2.GameFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPlayer {
    private ArrayList<Player> players = new ArrayList<>();
    public static Iterator<Player> playerIterator;

    public void addPlayer(Player p){
        players.add(p);
    }
    public void createIterator(){
        if(!players.isEmpty()) {
            System.out.println("Created iterator");
            playerIterator = players.iterator();
        }
    }
    public int getPlayerNumber(){
        return players.size();
    }
}
