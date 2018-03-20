package ru.itis.quickhull;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int DEFAULT_ARRAY_SIZE = 15;

    public static double countingCos(double x1, double y1, double x0, double y0) {
        double x = x1 -x0;
        double y = y1 - y0;
        double squareX = x *x;
        double squareY = y * y;
        double squares = squareX + squareY;
        double sqrt = Math.sqrt(squares);
        double cos = x / sqrt;
        return cos;
    }

    public static void skew(Point point, Point point1, Point[] array, Point[] upper, Point[] under){

        double cos = countingCos(point.getX(), point.getY(), point1.getX(), point1.getY());
        for(int i = 0; i < array.length; i++) {
            double checkCos = countingCos(array[i].getX(), array[i].getY(), point1.getX(), point1.getY());
            double nonCos = -1 * cos;

            if((cos == checkCos) || (nonCos == checkCos)) {

            } else if ((checkCos > nonCos) && (checkCos > cos)) {

            } else {

            }
        }
    }

    public static void main(String[] args) {
        Line given = new Line();
        Line shell = new Line();


        try {
            File input = new File("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\SkewMultiplying\\src\\ru\\itis\\quickhull\\Coordinates");
            Scanner reader = new Scanner(input);
            String coordinates = null;

            while (reader.hasNext()) {
                coordinates = reader.nextLine();
                double x = ((coordinates.charAt(0) - '0') * 10) + (coordinates.charAt(1) - '0');
                double y = ((coordinates.charAt(3) - '0')* 10) + (coordinates.charAt(4) - '0');
                given.add(new Point());
                given.points[given.getSize() - 1].setX(x);
                given.points[given.getSize() - 1].setY(y);
            }
        } catch (IOException e) {
            System.out.println("File's not found");
        }

        Point left = given.points[0];
        Point right = given.points[0];
        for(int i = 1; i < given.getSize(); i++) {
            if(given.points[i].getX() < left.getX()) {
                left = given.points[i];
            }
            if(given.points[i].getX() > right.getX()) {
                right = given.points[i];
            }
        }

        System.out.println(left);
        System.out.println(right);

    }
}
