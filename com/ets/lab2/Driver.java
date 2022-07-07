package com.ets.lab2;

import com.ets.lab2.Bunco.Bunco;
import com.ets.lab2.Bunco.BuncoFactory;
import com.ets.lab2.GameFrameWork.*;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    System.out.println("Bienvenue à Bunco+");
        System.out.println("-----------------------");
        System.out.println("Veuillez choisir un mode de jeu");
        System.out.println("Bunco classique (1)");
        System.out.println("Bunco personalisé (2)");
        try{
            int typeJeu = sc.nextInt();
            if(typeJeu == 1 || typeJeu == 2){
                System.out.println("Combien de joueurs y aura-t'il?");
                int playerLimit = sc.nextInt();
                sc.nextLine();
                CollectionPlayer cp = new CollectionPlayer();

                for(int i = 1; i <= playerLimit; i++){
                    System.out.println("Quel est le nom du joueur " + i + "? ");
                    String name = sc.nextLine();
                    cp.addPlayer(new Player(name));
                }

                IStrategy game;
                if(typeJeu == 2){
                    System.out.println("Combien de dés y aura-t'il?");
                    int diceLimit = sc.nextInt();
                    System.out.println("Combien de tours y aura-t'il?");
                    int roundLimit = sc.nextInt();

                    game = new GameFactory().generateGame(cp,diceLimit, roundLimit);
                }
                else{
                    game = new BuncoFactory().generateBuncoGame(cp);
                }

                System.out.println("-----------------------");

                for(int i = 0; i < game.getRuleset().getRoundLimit(); i++){
                    game.calculateScoreTurn();
                }

                System.out.println("=======================");

                Player[] winners = game.calculateWinner();
                System.out.println("Le classement final est:");
                for(Player winner : winners){
                    System.out.println(winner.getName() + " avec " + winner.getScore().getPoints() + " points");
                }

                System.out.println("Merci d'avoir participé!");
            }
            else System.out.println("Choix invalide");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
