package ru.itis;

public class Main {

    public static void main(String[] args) {

        String[] lines = {"ab", "cd", "de", "jk", "da", "aa"};
        System.out.println("How it was:");
        for(int i = 0; i < lines.length; i++) {
            System.out.print(lines[i] + " ");
        }

        System.out.println();
        System.out.println("---------------");

        for (int i = lines.length - 1; i>=0; i--) {
            for (int j = 0; j < i; j++) {
                if (lines[j].compareTo(lines[j+1]) > 0) {
                    String t = lines[j];
                    lines[j] = lines[j+1];
                    lines[j+1] = t;
                }
            }
        }

        System.out.println("How it's looking now:");
        for(int i = 0; i < lines.length; i++) {
            System.out.print(lines[i] + " ");
        }
    }
}
