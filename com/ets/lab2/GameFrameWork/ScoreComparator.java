package com.ets.lab2.GameFrameWork;

public class ScoreComparator implements Comparable {

    public int compareScore(Score s1, Score s2){
        if(s1.getPoints() > s2.getPoints()) return -1;
        else if(s1.getPoints() < s2.getPoints()) return 1;
        else return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
