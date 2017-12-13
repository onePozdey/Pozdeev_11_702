package ru.itis;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        if ((number / 100000 == number % 10) && (number / 10000 % 10 == number % 100 / 10) && (number / 1000 % 10 == number % 1000 / 100)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
