package com.ets.lab2.GameFrameWork;

import java.util.Random;

public class Dice implements Comparable<Dice>{
    private int sides;
    private int value;

    public Dice(int sides) {
        this.sides = sides;
    }

    /**
     * Attribue une valeur aléatoire entre 1 et le nombre de côtés du dé au dé.
     * @return nouvelle valeur du dé
     */
    public int roll(){
        Random r = new Random();
        value = r.nextInt(sides) + 1;
        return value;
    }

    /**
     * Retourne le nombre de côtés du dé.
     * @return le nombre de côtés du dé
     */
    public int getSides() {
        return sides;
    }

    /**
     * Modifie le nombre de côtés du dé au nombre spécifié.
     * @param sides le nombre de côtés du dé
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Retourne la valeur du dé.
     * @return la valeur du dé
     */
    public int getValue() {
        return value;
    }

    /**
     * Compare la valeur de ce dé avec celle d'un autre.
     * @param o le dé à comparer
     * @return -1: Si ce dé à une valeur inférieure au deuxième. 1: Si ce dé à une valeur supérieure au deuxième. 0: Si les valeurs sont égales.
     */
    @Override
    public int compareTo(Dice o) {
        int comparison = 0;
        if(value < o.getValue()) comparison = -1;
        else if(value > o.getValue()) comparison = 1;
        else comparison = 0;

        return comparison;
    }
}
