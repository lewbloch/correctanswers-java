package com.lewscanon.lessons.syntax;

public class CharFault {
    public static void main(String... args) {
        char zero = 0;
        char uZero = '\u0000';
        System.out.printf("zero = %d, uZero = %d%n", (int) zero, (int) uZero);
    }
}
