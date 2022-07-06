package com.ets.lab2.GameFrameWork;

public class Rules {
    private int playerLimit;
    private int diceLimit;
    private int roundLimit;

    public Rules(int playerLimit, int diceLimit, int roundLimit) {
        this.playerLimit = playerLimit;
        this.diceLimit = diceLimit;
        this.roundLimit = roundLimit;

    }

    /**
     * Retourne la limite de joueurs.
     * @return la limite de joueurs
     */
    public int getPlayerLimit() {
        return playerLimit;
    }

    /**
     * Modifie la limite de joueurs à la limite de joueurs spécifiée.
     * @param playerLimit la limite de joueurs spécifiée
     */
    public void setPlayerLimit(int playerLimit) {
        this.playerLimit = playerLimit;
    }

    /**
     * Retourne la limite de dés.
     * @return la limite de dés
     */
    public int getDiceLimit() {
        return diceLimit;
    }

    /**
     * Modifie la limite de dés à la limite de dés spécifiée.
     * @param diceLimit la limite de dés spécifiée
     */
    public void setDiceLimit(int diceLimit) {
        this.diceLimit = diceLimit;
    }

    /**
     * Retourne la limite de tours.
     * @return la limite de tours
     */
    public int getRoundLimit() {
        return roundLimit;
    }

    /**
     * Modifie la limite de tours à la limite de tours spécifiée.
     * @param roundLimit la limite de tours spécifiée
     */
    public void setRoundLimit(int roundLimit) {
        this.roundLimit = roundLimit;
    }
}
