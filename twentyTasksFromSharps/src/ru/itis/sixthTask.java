package ru.itis;

import java.util.Scanner;

public class sixthTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int year = reader.nextInt();
         if(((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0)) {
             System.out.println("13/09/" + year);
         } else {
             System.out.println("12/09/" + year);
         }
    }
}
