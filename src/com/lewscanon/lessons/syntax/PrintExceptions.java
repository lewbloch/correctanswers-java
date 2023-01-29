/* Copyright © 2023 Lewis S. Bloch. */
package com.lewscanon.lessons.syntax;

/**
 * Observe the flow of {@code println()} and exceptions.
 */
public class PrintExceptions {
    /**
     * Test {@code println()} and exceptions with a {@code System.exit()}.
     * @param args command arguments.
     */
    public static void main(String ... args) {
        try {
            System.out.println("one");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("two");
        } finally {
            System.out.println("three");
        }
    }
}
