package ru.itis.Task20_OOP;


import java.util.Scanner;

public class Main {
    public static String sum(long rub1, byte cop1, long rub2, byte cop2) {
        long rubSum = rub1 + rub2;
        byte copSum = (byte)(cop1 + cop2);
        if(copSum >= 100) {
            rubSum++;
            copSum -= 100;
        }
        return rubSum + "," + copSum;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Money money = new Money(reader.nextLong(), reader.nextByte());
        Money cash = new Money(reader.nextLong(), reader.nextByte());
        money.toString();
        sum(money.getRubles(), money.getCopecks(), cash.getRubles(), cash.getCopecks());
    }
}