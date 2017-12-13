package ru.itis;

public class Main {

    public static int parse(char[] number) {
        int num = 0;
        int digit = 0;
        for(int i = 0; i < number.length; i++) {
            digit = number[i] - '0';
            num = (num + digit) * 10;
        }
        num = num / 10;
        return num;
    }

    public static void main(String[] args) {
	    char[] number = {};
	    int x = parse(number);

        System.out.println(x);
    }
}
