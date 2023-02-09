package com.lewscanon.lessons.syntax;

/** Explore equality. */
public class Equalitator {
    /**
     * Experiment with equality.
     * @param args command arguments.
     */
    public static void main(String[] args) {
        String hello = "Hello";
        String world = " World";

        //noinspection ResultOfMethodCallIgnored
        hello.concat(world);

        String helloWorld1 = "Hello World";

        @SuppressWarnings("StringOperationCanBeSimplified")
        String helloWorld2 = new String("Hello World");

        @SuppressWarnings("StringBufferReplaceableByString")
        String helloWorld3 = new StringBuilder("Hello World").toString();

        String helloWorld4 = "Hello World";

        //noinspection ConstantValue
        System.out.println(hello.equals(helloWorld1)); // 1

        System.out.println(helloWorld3.equals(helloWorld1)); // 2

        //noinspection StringEquality,NewObjectEquality
        System.out.println(helloWorld1 == helloWorld2); // 3

        //noinspection StringEquality
        System.out.println(helloWorld3 == helloWorld2); // 4

        //noinspection StringEquality
        System.out.println(helloWorld1 == helloWorld4); // 5
    }
}
