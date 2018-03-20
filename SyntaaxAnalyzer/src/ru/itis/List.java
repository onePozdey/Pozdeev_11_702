package ru.itis;

public class List {

    public class Variable {
        int value;
        String name;
        Variable next;

        public Variable(int value, String name) {
            this.name = name;
            this.value = value;
            this.next = null;
        }
    }

    private Variable head;
    private Variable tail;
    private int size;

    public List() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int value, String name) {
        Variable newVariable = new Variable(value, name);
        if(head == null) {
            head = newVariable;
            tail = newVariable;
            size++;
        } else {
            tail.next = newVariable;
            tail = newVariable;
            size++;
        }
    }
 }
