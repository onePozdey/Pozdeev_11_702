package ru.itis;

public class Main {

    public static void main(String[] args) {
        String[] lines = {"asd", "adechi", "qwerty", "fuck"};
        int ass = 0;
        int necessary = 0;
        for (int j = 0; j < lines.length; j++) {
            for (int i = 0; i < lines[i].length() - 1; i++) {
                if (lines[i].charAt(i) > lines[i].charAt(i + 1)) {
                    ass++;
                }
                if(ass == 0) {
                    necessary = j;
                }
                ass = 0;

            }
            
        }
        System.out.println("The necessary line is " + necessary);
    }
}
