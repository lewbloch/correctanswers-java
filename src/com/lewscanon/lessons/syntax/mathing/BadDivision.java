package com.lewscanon.lessons.syntax.mathing;

public class BadDivision {
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
    }
}
