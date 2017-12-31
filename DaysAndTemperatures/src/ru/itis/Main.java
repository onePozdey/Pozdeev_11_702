package ru.itis;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File input = new File("input.txt");
        Scanner fileReader = new Scanner(input);
        int months[] = new int[12];
        int daysInMonths[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double yearTemp = 0;
        double difference = 0;
        double minDifference = 0;

        // Emil's code starts here
        String date;
        String dayTemp;
        int month;

        while(fileReader.hasNext()) {
            date = fileReader.next();
            dayTemp = fileReader.next();
            month = (((int)date.charAt(3) - '0') * 10) + ((int)date.charAt(4) - '0');
            months[month - 1] += Double.parseDouble(dayTemp);
            yearTemp += Double.parseDouble(dayTemp);
        }
        // Emil's code ends here

        yearTemp /= 366;
        months[0] /= daysInMonths[0];
        minDifference = Math.abs(yearTemp - months[0]);
        for(int i = 1; i < months.length; i++) {
            months[i] /= daysInMonths[i];
            difference = Math.abs(yearTemp - months[i]);
            if(minDifference > difference) {
                minDifference = difference;
            }
        }
        for(int i = 0; i < months.length; i++) {
            if(Math.abs(yearTemp - months[i]) == minDifference) {
                System.out.println(i + 1);
            }
        }
    }
}