package ru.itis;

import java.util.Scanner;

public class Main {

    public static String sum(Money money, Money cash) {
        money.setRubles(money.getRubles() + cash.getRubles());
        money.setCopecks((byte)(money.getCopecks() + cash.getCopecks()));
        if(money.getCopecks() >= 100) {
            money.setRubles(money.getRubles() + 1);
            money.setCopecks((byte)(money.getCopecks() - 100));
        }
        money.toString();
        System.out.println(" after addition");
        return "";
    }
    public static String difference(Money money, Money cash) {
        money.setRubles(money.getRubles() - cash.getRubles());
        money.setCopecks((byte)(money.getCopecks() - cash.getCopecks()));
        if(money.getCopecks() < 0) {
            money.setRubles(money.getRubles() - 1);
            money.setCopecks((byte)(100 + money.getCopecks()));
        }
        money.toString();
        System.out.println(" after subtraction");
        return "";
    }
    public static String multiply(int multiplier, Money money) {
        long amount = money.getRubles() * 100 + money.getCopecks();
        long result = amount * multiplier;
        money.setRubles(result / 100);
        money.setCopecks((byte)(result % 100));
        money.toString();
        System.out.println(" after multiplying");
        return "";
    }
    public static String compare(Money money, Money cash) {
        if(money.getRubles() > cash.getRubles()) {
            System.out.println("first amount is bigger");
            return "";
        } else if(money.getRubles() == cash.getRubles()) {
            if(money.getCopecks() > cash.getCopecks()) {
                System.out.println("first amount is bigger");
                return "";
            } else if (money.getCopecks() == cash.getCopecks()) {
                System.out.println("amounts are the same");
                return "";
            } else {
                System.out.println("second amount is bigger");
                return "";
            }
        } else {
            System.out.println("second amount is bigger");
            return "";
        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Money money = new Money(reader.nextLong(), reader.nextByte());

        Money cash = new Money(reader.nextLong(), reader.nextByte());

        money.toString();
        System.out.println();

        sum(money, cash);
        difference(money, cash);
        multiply(reader.nextInt(), money);
        compare(money, cash);
    }
}
