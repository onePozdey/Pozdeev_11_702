package ru.itis;

import java.util.Scanner;

public class tenthTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double a = reader.nextInt();
        double b = reader.nextInt();
        double c = reader.nextInt();
        double discriminant = 0;
        double x1 =0;
        double x2 = 0;

        if((a == 0) || (b == 0) && (c == 0)) {
            System.out.println("-1");
        } else {
            discriminant = b*b - 4*a*c;
            if(discriminant >= 0) {
                x1 = (-1 * b + Math.sqrt(discriminant)) / (2*a);
                x2 = (-1 * b - Math.sqrt(discriminant)) / (2*a);
            } else {
                System.out.println("No solutions");
            }
            if(x1 == x2) {
                System.out.println(x1);
            } else {
                System.out.println(x1 + " " + x2);
            }
        }
    }
}
