package com.lewscanon.lessons.syntax;

public class ShiftVsPower {
    public static void main(String... args) {
        long s1 = 1 << 30;
        long p1 = (long) Math.pow(2, 30);

        long s2 = 1 << 31;
        long p2 = (long) Math.pow(2, 31);

        System.out.printf("1 << 30 ( %d) == Math.pow(2, 30) (%d)? %b%n1 << 31 (%d) == Math.pow(2, 31) (%d)? %b%n",
                            s1, p1, s1 == p1, s2, p2, s2 == p2);
    }
}
