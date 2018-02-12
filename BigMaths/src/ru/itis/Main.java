package ru.itis;

import java.util.Scanner;

public class Main {

    public static void transform(String str, int[] array) {
        for(int i = 0; i < str.length(); i++) {                                     // int i = str.length() - 1; i >= 0; i--
            array[i + length - str.length()] = str.charAt(i) - '0';
        }
    }
    public static void sout(int[] array) {
        if(array[0] == 0) {
            for (int i = 1; i < array.length; i++) {
                System.out.print(array[i]);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
    public static void sum(int[] result, int[] array1, int[] array2) {
        int localSum = 0;
        for(int i = result.length - 1; i > 0; i--) {
            localSum = array1[i] + array2[i];
            if(localSum > 9) {
                result[i] += localSum % 10;
                result[i-1] += localSum / 10;
            } else {
                result[i] = localSum;
            }
        }
    }

    static int length = 0;

    public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    String firstLetter = reader.nextLine();
	    String secondLetter = reader.nextLine();

        if(firstLetter.length() > secondLetter.length()) {
            length = firstLetter.length() + 1;
        } else {
            length = secondLetter.length() + 1;
        }
        int result[] = new int[length];
        int firstNum[] = new int[length];
        int secondNum[] = new int[length];

        transform(firstLetter, firstNum);
        transform(secondLetter, secondNum);

        sum(result, firstNum, secondNum);
        sout(result);
    }
}
