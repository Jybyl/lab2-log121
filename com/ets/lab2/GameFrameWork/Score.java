package com.ets.lab2.GameFrameWork;

public class Score implements  IScoreStrategy{
    private int points;
    private ScoreComparator scoreComparator;

    public Score(int points) {
        this.points = points;
        this.scoreComparator = new ScoreComparator();
    }

    /**
     * Retourne le nombre de points.
     * @return le nombre de points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Modifie le nombre de points au nombre de points spécifié.
     * @param points le nombre de points spécifié
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * ??????????
     * @return
     */
    public int calculateScore(){
        return 0;
    }
}
