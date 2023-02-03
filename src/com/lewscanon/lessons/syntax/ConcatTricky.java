package com.lewscanon.lessons.syntax;

public class ConcatTricky {
    /**
     * Tricky concatenation question.
     * @param args command-line arguments.
     */
    public static void main(String... args) {
        String x = "abc";
        String y = "abc";
        //noinspection ResultOfMethodCallIgnored
        x.concat(y);

//        System.out.print (X);         // uncomment this line
        System.out.print (x);
    }
}
