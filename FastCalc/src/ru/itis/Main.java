package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double x = reader.nextInt();
        double y = 1.2592 * x + 146.5032;
        System.out.println(y);
    }
}
