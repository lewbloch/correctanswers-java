package com.lewscanon.lessons.syntax;

public class DoubleMath {
    public static void main(String... args) {
        long num = 1L << 53;
        System.out.printf("%nnum == %d%n", num);
        if (num < Double.MAX_VALUE) {
            double r1 = Math.sqrt(1) + num - num;
            double r2 = Math.sqrt(4) + num - num;
            double r3 = Math.sqrt(1) + num + 1 + 1 + 1 - num;
            double r4 = num - num + Math.sqrt(1);
            System.out.println(String.format((long) r1 + "," + (long) r2 + "," + (long) r3 + "," + (long) r4));
        } else System.out.println("Number is too large");
    }
}
