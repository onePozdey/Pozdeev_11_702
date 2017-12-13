package ru.itis;

public class Rectangle extends SpaceForFigures{
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public double countSquare() {
        return length*width;
    }

    public double countPerimeter() {
        return 2*(length + width);
    }
}
