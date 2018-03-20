package ru.itis;

public class Variable {
    int value;
    String name;
    Variable next;

    public Variable() {
        this.name = "NoName";
        this.value = 0;
        this.next = null;
    }
}
