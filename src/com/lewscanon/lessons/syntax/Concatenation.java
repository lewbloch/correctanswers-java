/* Copyright © 2023 Lewis S. Bloch. */
package com.lewscanon.lessons.syntax;

/**
 * Explore concatenation, or is it addition?
 */
public class Concatenation {
    /**
     * Test string "plus" int.
     * @param args command arguments.
     */
    public static void main(String ... args) {
        System.out.println("1"+2+3);

        String str1 = "A";
        str1 = str1.concat("B");
        String str2 = "C";
        str1 = str1.concat(str2);

        System.out.println();

        //noinspection ResultOfMethodCallIgnored
        str1.replace('C', 'D');
        str1 = str1.concat(str2);
        System.out.println(str1);
    }
}
