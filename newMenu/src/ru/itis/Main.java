package ru.itis;

import java.util.Scanner;

import static ru.itis.Functions.*;

public class Main {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int b = 0;
        int index = 0;
        int number = 0;
        int action = 0;
        int n = 0;
        int amount = 0;
        int trig = 0;
        int array[] = new int[n];
        int expArr[] = new int [n+1];

        while(action != 6) {
            outPut();
            trig = 0;
            action = reader.nextInt();
            if(action == 1) {
                array = creation(n);
            } else if(action == 2) {
                trig = 0;
                if(array != null) {
                    for(int i = 0; i < n; i++) {
                        expArr[i] = array[i];
                    }
                    expArr[expArr.length - 1] = reader.nextInt();
                    array = expArr;
                } else {
                    for (int i = 0; i < n; i++) {
                        if (array[i] == 0) {            //2nd option
                            array[i] = reader.nextInt();
                            trig++;
                        }
                    }
                }
                amount++;
            } else if(action == 3) {
                index = reader.nextInt();
                dlt(index, array.length, array);
                amount--;
            } else if(action == 4) {
                number = reader.nextInt();
                index = reader.nextInt();
                insrt(index, number, array.length, array);
                amount++;
            } else if(action == 5) {
                printt(array, array.length, amount);
            } else if(action == 6) {
                System.exit(0);
            }

        }
    }
}






        /*Scanner reader = new Scanner(System.in);

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
        }*/


