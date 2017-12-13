package ru.itis;

public class Dots {
    private double x;
    private double y;

    public Dots(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void print() {
        System.out.println("X: " + getX() + " Y: " + getY());
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

}
