package ru.itis;

import java.util.Iterator;

public class LinkedList<T> implements List<T>{
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public class Node {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head  = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void addToBegin(T object) {
        Node newNode = new Node(object);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;

    }

    @Override
    public void contains(T object) {

    }

    @Override
    public void remove(T object) {

    }

    @Override
    public T get(int index) {
        if (index < size) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        }
        return null;
    }

    private class LinkedIterator implements Iterator<T> {
        private int currentIndex;

        LinkedIterator() {
            this.currentIndex = 0;
        }
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
//            T result = ;
//            currentIndex++;
            return null;
        }
    }

    public static <E extends Comparable<E>> LinkedList<E> merge(LinkedList<E> aList, LinkedList<E> bList) {
        LinkedList<E> result = new LinkedList<>();

        Iterator<E> aIterator = aList.iterator();
        Iterator<E> bIterator = bList.iterator();


        return null;
    }

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
}
