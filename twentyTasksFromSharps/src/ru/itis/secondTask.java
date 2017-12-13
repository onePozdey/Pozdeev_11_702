package ru.itis;

import java.util.Scanner;

public class secondTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String fromCoord = reader.next();
        String toCoord = reader.next();

        char letterFrom = fromCoord.charAt(0);
        char letterTo = toCoord.charAt(0);
        int numberFrom = fromCoord.charAt(1) - '0';
        int numberTo = toCoord.charAt(1) - '0';

        if((letterFrom == letterTo) && ((numberTo - numberFrom) == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
