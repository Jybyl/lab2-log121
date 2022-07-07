package com.ets.lab2.GameFrameWork;

public class GameFactory {
    /**
     * Génère une instance de Game.
     * @param cp collection de joueurs
     * @param diceLimit nombre de dés
     * @param roundLimit nombre de tours
     * @return une instance de Game
     */
    public Game generateGame(CollectionPlayer cp, int diceLimit, int roundLimit){
        Game g = new Game(cp.getPlayerNumber(), diceLimit, roundLimit);
        g.setPlayers(cp);
        DiceFactory df = new DiceFactory();
        CollectionDice die = df.generateDice();
        for(int i = 0; i < g.getRuleset().getDiceLimit(); i++){
            die.addDice(new Dice(g.getRuleset().getRoundLimit()));
        }
        die.createIterator();
        cp.createIterator();
        g.setDie(die);
        return g;
    }
}
