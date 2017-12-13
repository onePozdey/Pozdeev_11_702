package ru.itis;

import java.util.Scanner;

public class fifthTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String firstCoords = reader.next();
        String seconfCoords = reader.next();

        char firstLetter = firstCoords.charAt(0);
        char secondLetter = seconfCoords.charAt(0);
        int firstNum = firstCoords.charAt(1) - '0';
        int secondNum = seconfCoords.charAt(1) - '0';

        int firstSum = firstLetter + firstNum;
        int secondSum = secondLetter + secondNum;

        System.out.println(firstSum + secondSum);
        //TODO to finish the program
    }
}

