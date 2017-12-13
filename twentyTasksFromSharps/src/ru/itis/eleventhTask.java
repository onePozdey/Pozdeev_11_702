package ru.itis;

import java.util.Scanner;

public class eleventhTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x1 = reader.nextDouble();
        double y1 = reader.nextDouble();
        double x2 = reader.nextDouble();
        double y2 = reader.nextDouble();
        double x3 = reader.nextDouble();
        double y3 = reader.nextDouble();

        double firstSide = Math.sqrt((x1 - x2)*(x1-x2) + (y2-y1)*(y1 - y1));
        double secondSide = Math.sqrt((y2 - y3)*(y2 - y3) + (x2 - x3)*(x2 -x3));
        double thirdSide = Math.sqrt((x1 - x3)*(x1 -x3) + (y1 - y3)*(y1 - y3));

        double perimetr = firstSide + secondSide + thirdSide;
        double halfPerimetr = perimetr / 2;
        double square = Math.sqrt(halfPerimetr * (halfPerimetr - firstSide) * (halfPerimetr - secondSide) * (halfPerimetr - thirdSide));

        System.out.println(square);
    }
}
