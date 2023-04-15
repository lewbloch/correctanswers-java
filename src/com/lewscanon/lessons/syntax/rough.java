package com.lewscanon.lessons.syntax;

public class rough {

    static int sum(int a, int b) {
        return a + b;
    }

    static final String FMT = "sum(%d, '%c') -> %d '%c'%n";
    public static void main(String... args) {
        System.out.println();

        int a = 2;
        char ch = 'a';
        System.out.printf(FMT, a, ch, sum(a, ch), sum(a, ch));

        ch = '1';
        System.out.printf(FMT, a, ch, sum(a, ch), sum(a, ch));

        a = 1;
        System.out.printf(FMT, a, ch, sum(a, ch), sum(a, ch));
    }
}
