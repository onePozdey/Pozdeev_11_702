package ru.itis;

import java.util.Scanner;

public class seventhTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstSide = reader.nextInt();
        int secondSide = reader.nextInt();
        int thirdSide = reader.nextInt();

        if (((firstSide + secondSide) > thirdSide) || ((secondSide + thirdSide) > firstSide) || ((firstSide + thirdSide) > secondSide)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
