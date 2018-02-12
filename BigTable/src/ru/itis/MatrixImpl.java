package ru.itis;

import java.util.ArrayList;

public class MatrixImpl implements Matrix {

    public static class Slot {
        int column;
        int line;
        int slotValue;

        public Slot(int column, int line, int slotValue) {
            this.column = column;
            this.line = line;
            this.slotValue = slotValue;
        }
    }

    public void set(int i, int j, int value){

    }
    public int get(int i, int j) {
        return i;
    }
}
