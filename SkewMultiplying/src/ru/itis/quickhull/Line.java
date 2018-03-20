package ru.itis.quickhull;

import org.omg.PortableServer.POA;

import static ru.itis.quickhull.Main.DEFAULT_ARRAY_SIZE;

public class Line {
    Point[] points;
    private int size;

    public Line() {
        points = new Point[DEFAULT_ARRAY_SIZE];
        this.size = 0;
    }

    public void add(Point point) {
        if(size < DEFAULT_ARRAY_SIZE) {
            points[size++] = point;
        } else {
            System.out.println("reached max size");
        }
    }

    public void remove(Point point) {
        int i = 0;
        while(points[i] != point) {
            i++;
        }
        points[i] = points[i + 1];
        size--;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
