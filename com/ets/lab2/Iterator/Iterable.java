package com.ets.lab2.Iterator;

public interface Iterable<T> {
    /**
     * Crée et retourne une instance de l'itérateur.
     * @return itérateur
     */
    public Iterator<T> createIterator();
}
