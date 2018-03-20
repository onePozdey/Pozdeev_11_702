package ru.itis;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 10;

    private T elements[];
    private int count;

    public ArrayList() {
        this.elements = new <T>[DEFAULT_SIZE];
        this.count = 0;
    }

    @Override
    public T get(int index) {
        if (index < this.count) {
            return elements[index];
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addToBegin(T object) {

    }

    @Override
    public void add(T element) {
        if (this.count < this.elements.length) {
            this.elements[count++] = element;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < count; i++) {
            if (element.equals(elements[i])) {
                for (int j = i; j < count - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                count--;
                return;
            }
        }
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
