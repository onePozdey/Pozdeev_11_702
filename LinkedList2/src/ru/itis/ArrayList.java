package ru.itis;

import java.util.Iterator;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_ARRAY_CAPACITY = 10;

    T elements[];
    int size;

    public ArrayList() {
        this.elements = (T[])(new Object[DEFAULT_ARRAY_CAPACITY]);
        this.size = 0;
    }

    @Override
    public void add(T object) {
        if(size < DEFAULT_ARRAY_CAPACITY) {
            elements[size++] = object;
        } else {
            System.out.println("Size has already reached its maximum");
        }
    }

    @Override
    public void addToBegin(T object) {
        if(size < DEFAULT_ARRAY_CAPACITY) {
            for(int i = DEFAULT_ARRAY_CAPACITY - 1; i > 0; i--) {
                elements[i] = elements[i - 1];
            }
            elements[0] = object;
            size++;
        } else {
            System.out.println("Size has already reached its maximum");
        }
    }

    @Override
    public void remove(T object) {
        for(int i = 0; i < size; i++) {
            if(object == elements[i]){
                for(int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
            }
        }
    }

    @Override
    public void contains(T object) {
        boolean isHere = false;
        for(int i = 0; i < size; i++) {
            if(object == elements[i]) {
                System.out.println("Element " + elements[i] + " is found");
                System.out.println();
                return;
            }
        }
        if(!isHere){
            System.out.println("Element " + object + " is not found");
            System.out.println();
        }
    }

    @Override
    public T get(int index) {

        return null;
    }

    public void sout() {
        for(int i = 0; i < size; i++) {
            System.out.print("[" + elements[i] + "] ");
        }
        System.out.println();
    }

    private class ArrayListIterator implements Iterator<T> {
        private int currentIndex;

        ArrayListIterator() {
            this.currentIndex = 0;
        }
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }
        @Override
        public T next() {
            T result = elements[currentIndex];
            currentIndex++;
            return result;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }
}
