package ru.itis;

public class Space {
    Line line = new Line();
    private int size = 0;   // for dot array
    private int size2 = 0;  // for line array
    private int i = 0;
    private Dots dots[] = new Dots[15];
    private Line lines[] = new Line[10];

    void addDot(Dots dot){
        dots[size++] = dot;
    }
    void addLine(Line line) {
        lines[size2++] = line;
    }
    void delete(Dots dot) {
        int f = 0;
        while((f == 0) && (i < getSize())) {
            if(dots[i] == dot) {
                f = 1;
            }
            i++;
            setI(i);
        }
        f = 0;
        for(getI(); getI() < getSize(); setI(i++)) {
            dots[getI()] = dots[getI() + 1];
        }
    }
    void printDots() {
        for(int i = 0; i < size; i++) {
            dots[i].print();
        }
    }

    void printLines() {
        for(int i = 0; i < getSize2(); i++) {
            line.lineOutPut();
        }
    }

    public int getSize2() {
        return size2;
    }
    public Line[] getLines() {
        return lines;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setI(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public void setDots(Dots[] dots) {
        this.dots = dots;
    }
    public Dots[] getDots() {
        return dots;
    }
}
