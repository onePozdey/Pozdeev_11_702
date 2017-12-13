package ru.itis;

import java.util.Scanner;

public class Functions {
    public static void outPut() {
        System.out.println();
        System.out.println("             Menu");
        System.out.println("     1. Create the array");
        System.out.println(" 2. Add an element to the end");
        System.out.println("     3. Delete an element");
        System.out.println("4. Add an element to the array");
        System.out.println("         5. Array out");
        System.out.println("           6. Exit");
    }
    public static  int[ ] creation(int n){
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        int array[] = new int[n];

        return array;
    }

    public static void dlt(int index, int len, int array[]) {
        if(index == 0) {
            for(int i = 0; i < len -1; i++) {
                array[i] = array[i+1];
            }
        } else {
            for(int i = index; i < len; i++) {
                array[i-1] = array[i];
            }
        }
        array[len - 1] = 0;
    }

    public static void insrt(int index, int number, int len, int array[]) {
        for(int i = len - 1; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = number;
    }

    public static void printt(int array[], int n, int amount) {
            for(int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
    }
}

