package com.ets.lab2.GameFrameWork;

public abstract class GameTemplate {
    private CollectionPlayer players;
    private CollectionDice die;

    public abstract Player[] calculateWinner();

    /**
     * Retourne une collection de joueurs.
     * @return une collection de joueurs
     */
    public CollectionPlayer getPlayers(){
        return players;
    }

    /**
     * Retourne une collection de dés.
     * @return une collection de dés
     */
    public CollectionDice getDie(){
        return die;
    }

    /**
     * Modifie la collection de joueurs du jeu à la collection de joueurs spécifiée.
     * @param players la collection de joueurs spécifiée
     */
    public void setPlayers(CollectionPlayer players) {
        this.players = players;
    }

    /**
     * Modifie la collection de dés du jeu à la collection de dés spécifiée.
     * @param die la collection de dés spécifiée
     */
    public void setDie(CollectionDice die) {
        this.die = die;
    }
}
