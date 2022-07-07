package com.ets.lab2.Iterator;

public interface Iterator<T> {
    /**
     * Vérifie si il y a un prochain élément dans la suite à itérer.
     * @return true: Si il y a un prochain élément. false: Si il y en a pas.
     */
    public boolean hasNext();

    /**
     * Retourne le prochain élément dans la suite à itérer.
     * @return le prochain élément
     */
    public T getNext();
}
