package com.ets.lab2.GameFrameWork;

public class GameFactory {
    /**
     * Génère une instance de Game.
     * @return une instance de Game
     */
    public Game generateGame(){
        Game g = new Game(5, 2, 1, 5);

        return g;
    }
}
