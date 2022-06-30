package com.ets.lab2.GameFrameWork;

public class Score {
    private int points;
    private ScoreComparator scoreComparator;

    public Score(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public int calculateScore(){
        return 0;
    }
}
