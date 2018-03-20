package ru.itis;

public class Analyzer {
    List analyzedList;

    public Analyzer() {
        this.analyzedList = new List();
    }

    public void analyze(String input) {
        int i = 0;
        char element = input.charAt(i);
        int state = 0;
        switch (state) {
            case 0:
                if ((element >= 'A') && (element <= 'Z')) {
                    state = 1;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 228;
                }
            case 1:
                if ((element >= '0') && (element <= '9')) {
                    state = 2;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 228;
                }
            case 2:
                if (element == ':') {
                    state = 3;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 228;
                }
            case 3:
                if (element == '=') {
                    state = 4;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 228;
                }
            case 4:
                if ((element >= '0') && (element <= '9')) {
                    state = 5;
                    i++;
                    element = input.charAt(i);
                    break;
                } else if (element == ';') {
                    state = 0;
                    i++;
                    element = input.charAt(i);
                    break;
                } else if ((element >= 'A') && (element <= 'Z')) {
                    state = 7;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 228;
                }
            case 5:
                if (element == ';') {
                    state = 0;
                    i++;
                    element = input.charAt(i);
                    break;
                } else if ((element >= '0') && (element <= '9')) {
                    state = 5;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 1337;
                }
            case 7:
                if ((element >= '0') && (element <= '9')) {
                    state = 8;
                    i++;
                    element = input.charAt(i);
                    break;
                } else {
                    state = 228;
                }
            case 8:
                if ((element == '+') || (element == '-') || (element == '*') || (element == '/')) {
                    state = 4;
                    i++;
                    element = input.charAt(i);
                    break;
                }
            case 228:
                SyntaxException e = new SyntaxException(i);
                break;
            case 1337:
                break;

        }
    }
}


