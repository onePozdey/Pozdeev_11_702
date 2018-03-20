package ru.itis;

public class LinkedList <K, V> {

    public class Node {
        int hash;
        Node next;
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    Node head;
    Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(K key, V value) {
        Node node = new Node(key, value);
        if(head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
