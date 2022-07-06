package com.ets.lab2.GameFrameWork;

public class ScoreComparator{

    /**
     * Compare un score avec un autre.
     * @param s1 un premier score
     * @param s2 un deuxième score
     * @return -1: Si ce score est inférieur au deuxième. 1: Si ce score est supérieur au deuxième. 0: Si les scores sont égaux.
     */
    public int compareScore(Score s1, Score s2){
        int comparison = 0;
        if(s1.getPoints() < s2.getPoints()) comparison = -1;
        else if(s1.getPoints() > s2.getPoints()) comparison = 1;
        else comparison = 0;

        return comparison;
    }

}
