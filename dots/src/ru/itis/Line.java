package ru.itis;

public class Line {
    private Dots line[] = new Dots[10];
    private int size = 0;

    void addDot(Dots dot) {
        line[size] = dot;
        new Space().delete(dot);
    }
    void lineOutPut() {
        for(int i = 0; i < getSize(); i++) {
            line[i].print();
        }
    }

    public int getSize() {
        return size;
    }
    public Dots[] getLine() {
        return line;
    }
}
