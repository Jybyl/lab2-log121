package com.ets.lab2.GameFrameWork;

public interface IScoreStrategy {
    /**
     * Calcule le nouveau score obtenu.
     * @return le nouveau score
     */
    public int calculateScore(int points);
}
