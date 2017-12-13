package ru.itis;

import java.util.Scanner;

public class eigthTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double x1 = reader.nextDouble();
        double y1 = reader.nextDouble();
        double radius1 = reader.nextDouble();
        double x2 = reader.nextDouble();
        double y2 = reader.nextDouble();
        double radius2 = reader.nextDouble();

        double distance = Math.sqrt((x1*x1 - x2*x2) + (y1*y1 - y2*y2));

        if((distance < radius1) && (distance < radius2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
