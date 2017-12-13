package ru.itis;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstTicket = reader.nextInt();
        int secondTicket = reader.nextInt();

        int firstSum = (firstTicket / 100000) + (firstTicket / 10000 % 10) + (firstTicket/ 1000 % 10);
        firstSum = (firstTicket / 100 % 10) + (firstTicket / 10 % 10) + (firstTicket % 10);

        int secondSum = (secondTicket / 100000) + (secondTicket / 10000 % 10) + (secondTicket/ 1000 % 10);
        secondSum = (secondTicket / 100 % 10) + (secondTicket / 10 % 10) + (secondTicket % 10);

        if(firstSum == secondSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
