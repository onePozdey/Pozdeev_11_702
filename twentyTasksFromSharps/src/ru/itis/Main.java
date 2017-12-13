package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String coords = reader.next();

        char letter = coords.charAt(0);
        int num = coords.charAt(1) - '0';
        int sum = letter + num;

        if(sum % 2 == 0) {
            System.out.println("Black");
        } else {
            System.out.println("White");
        }
    }
}
