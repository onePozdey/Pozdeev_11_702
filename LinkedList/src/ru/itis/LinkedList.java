package ru.itis;

public class LinkedList<T> implements List<T> {
    private static class Node<K> {
        K value;
        Node next;

        Node(K value) {
            this.value = value;
        }
    }
    // ссылка на первый элемент списка
    private Node head;
    // ссылка на последний элемент списка
    private Node tail;
    private Node node;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public T get(int index) {
        int element = 0;
        Node answer = head;
        while(element != index){
            element++;
            answer = answer.next;
        }
        return answer.value;
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
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public void remove(T element) {
        if (!contains(element))
            return;
        Node current = head;
        Node previous = null;
        while(!current.value.equals(element)){
            previous = current;
            current = current.next;
        }
        if (previous == null){
            head = current.next;
        } else {
            if (current == tail) {
                tail = previous;
                tail.next = null;
            } else {
                previous.next = current.next;
            }
        }
    }


    @Override
    public boolean contains(T element) {
        Node current = head;
        while(!current.value.equals(element) && current != tail){
            current = current.next;
        }
        return (current.value.equals(element)) ? true : false;
    }

    public LinkedList reverce(LinkedList list) {
        return null;
    }

    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
}
