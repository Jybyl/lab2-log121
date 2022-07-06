package com.ets.lab2.Collections;

import java.util.Iterator;

public class Collections<T> implements Iterable<T> {

    private T[] objectArray;
    private int tail = 0;
    private int size = 100;


    public Collections(){
        objectArray = (T[])new Object[size];
    }
    public void add(T value){
        objectArray[tail] = value;
        tail++;

        if(tail == objectArray.length - 1){
            T[] newObjectArray = (T[]) new Object[objectArray.length + size];
            newObjectArray = objectArray.clone();
            objectArray = newObjectArray;
        }
    }



    public  int getSize(){
        return tail;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
    private class IteratorCollection<Y> implements Iterator<Y> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < getSize();
        }

        @Override
        public Y next() {
            Y objectIndexValue = (Y)objectArray[index];
            index++;
            return objectIndexValue;
        }
    }
}
