package com.ets.lab2.GameFrameWork;

public interface IStrategy {
    /**
     * Retourne un tableau des joueurs selon un ordre décroissant de scores.
     * @return un tableau des joueurs selon un ordre décroissant de scores
     */
    public Player[] calculateWinner();

    /**
     * Calcule le score des joueurs selon les nouvelles valeurs des dés pour le tour actuel.
     */
    public void calculateScoreTurn();

    /**
     * Retourne les règles du jeu.
     * @return les règles du jeu
     */
    public Rules getRuleset();
}
