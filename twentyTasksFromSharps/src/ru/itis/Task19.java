package ru.itis;

public class Task19 {
    public static void main(String[] args) {
        int n = 4;
        int a = 1623;
        int b = 1243;

        int aArray[] = new int[10];
        int bArray[] = new int[10];

        int i = 1;
        while(a != 0) {
            aArray[a % 10] = n - i;
            bArray[b % 10] = n - i;
            a = a /10;
            b = b / 10;
            i++;
        }

        int amount = 0;
        for(int j = 0; j < 10; j++) {
            if(aArray[j] != bArray[j] && aArray[j] != 0 && bArray[j] != 0) {
                amount++;
            }
        }
    }
}
