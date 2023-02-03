/**
 *
 */
package com.lewscanon.lessons.syntax;

/** Elucidate try-catch-finally behavior. */
public class FinallyCatcher {
    /**
     * Demonstrate try-catch-finally.
     * @param args command-line arguments.
     */
    @SuppressWarnings({"divzero", "NumericOverflow"})
    public static void main(String... args) {
        try {
            var val = 17 / 0;
            System.out.println("Calculated: " + val);
        }
        catch (ArithmeticException exc) {
            System.out.printf("%s: %s%n", exc.getClass().getSimpleName(), exc.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
