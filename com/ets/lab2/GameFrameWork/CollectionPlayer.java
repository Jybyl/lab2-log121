package com.ets.lab2.GameFrameWork;

import com.ets.lab2.Iterator.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPlayer implements Iterable<Player> {
    private ArrayList<Player> players = new ArrayList<>();
    public static Iterator<Player> playerIterator;

    public void addPlayer(Player p){
        players.add(p);
    }
    public Player getPlayer(int index){
        return players.get(index);
    }
    @Override
    public PlayerIterator createIterator(){
        if(!players.isEmpty()) {
            System.out.println("Created iterator");
            PlayerIterator playerIterator = new PlayerIterator(this);
            return playerIterator;
                    
        }
        return null;
    }
    public int getPlayerNumber(){
        return players.size();
    }
}
