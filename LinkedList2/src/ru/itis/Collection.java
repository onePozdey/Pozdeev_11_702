package ru.itis;

public interface Collection<E> extends Iterable<E> {
    void add(E object);
    void remove(E object);
    void contains(E object);
}
