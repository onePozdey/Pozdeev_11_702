package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	    Diana diana = new Diana();
	    int n = 0;
        System.out.println("Food left: " + diana.foodAmount);
        System.out.println("Do you want to eat?");
        System.out.println("Yes - 1, No - 2");
        n = reader.nextInt();
	    while ((n == 1) && (diana.foodAmount > 0)) {
            diana.eat(diana.foodAmount);
            System.out.println("OM-nom-nom (Diana has eaten)");
            System.out.println("Food left: " + diana.foodAmount);
            System.out.println("Do you want to eat?");
            System.out.println("Yes - 1, No - 2");
            n = reader.nextInt();
        }

        if (diana.foodAmount <= 0) {
            System.out.println("Diana has eaten all food un the world");
        }
    }
}
