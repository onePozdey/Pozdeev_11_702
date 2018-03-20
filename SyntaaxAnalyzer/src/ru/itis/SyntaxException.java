package ru.itis;

public class SyntaxException extends RuntimeException {

    public SyntaxException(int i) {
        toString(i);
    }

    public void toString(int index) {
        System.err.println("Syntax mistake found in thread: " + index);
        System.exit(228);
    }
}
