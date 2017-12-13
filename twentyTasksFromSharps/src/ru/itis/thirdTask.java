package ru.itis;

import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String fromCoord = reader.next();
        String toCoord = reader.next();

        char letterFrom = fromCoord.charAt(0);
        char letterTo = toCoord.charAt(0);
        int numFrom = fromCoord.charAt(1) - '0';
        int numTo = toCoord.charAt(1) - '0';

        int letterMove = Math.abs(letterFrom - letterTo);
        int numMove = Math.abs(numFrom - numTo);

        if (((letterMove == 2) && (numMove == 1)) || ((letterMove == 1) && (numMove == 2))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
