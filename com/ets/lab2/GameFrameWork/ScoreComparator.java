package com.ets.lab2.GameFrameWork;

public class ScoreComparator {

    public int compareScore(Score s1, Score s2){
        if(s1.getPoints() > s2.getPoints()) return -1;
        else if(s1.getPoints() < s2.getPoints()) return 1;
        else return 0;
    }
}
