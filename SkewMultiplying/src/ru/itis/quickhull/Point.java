package ru.itis.quickhull;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }


    @Override
    public String toString() {
        System.out.print("X: " + getX());
        System.out.println(" Y: " + getY() + "\n");
        return "";
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
