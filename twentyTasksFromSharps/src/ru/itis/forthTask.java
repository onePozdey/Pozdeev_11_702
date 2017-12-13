package ru.itis;

import java.util.Scanner;

public class forthTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String coordFrom = reader.next();
        String coordTo = reader.next();

        char letterFrom = coordFrom.charAt(0);
        char letterTo = coordTo.charAt(0);
        int numFrom = coordFrom.charAt(1) - '0';
        int numTo = coordTo.charAt(1) - '0';
        
        if((((letterFrom - letterTo) == 0) && ((numTo - numFrom) < 8)) || (((letterTo - letterFrom) < 8) && (numTo - numFrom) == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
