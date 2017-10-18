package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int arr[] = new int[n];
	    int expArr[] = new int [n+1];

	    for(int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }

        for(int i = 0; i < n; i++) {
           expArr[i] = arr[i];
        }
        expArr[arr.length] = reader.nextInt();
        arr = expArr;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
