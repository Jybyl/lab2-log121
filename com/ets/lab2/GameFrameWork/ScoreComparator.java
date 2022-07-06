package com.ets.lab2.GameFrameWork;

public class ScoreComparator{

    public int compareScore(Score s1, Score s2){
        int comparison = 0;
        if(s1.getPoints() < s2.getPoints()) comparison = -1;
        else if(s1.getPoints() > s2.getPoints()) comparison = 1;
        else comparison = 0;

        return comparison;
    }

}
