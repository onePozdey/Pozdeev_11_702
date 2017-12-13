package ru.itis;

import java.util.Scanner;

public class ninthTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        if(a == 0) {
            System.out.println(b + "x + " + c);
        } else if(b == 0) {
            System.out.println(a + "x^2 + " + c);
        } else if(c == 0) {
            System.out.println(a + "x^2 + " + b + "x");
        } else {
            System.out.println(a + "x^2 + " + b + "x + " + c);
        }
    }
}
