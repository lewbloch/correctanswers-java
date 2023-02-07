package com.lewscanon.lessons.syntax;

/** Unsigned integer arithmetic. */
@SuppressWarnings("ReassignedVariable")
public class Unsignatory {
    /**
     * Show unsigned integer arithmetic.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        char asChar = (char) (~'Z');
        int asInt = ~'Z';
        System.out.printf("%nexpr = \\xchar toInt  asInt char%n");

        System.out.printf("~'Z' = \\x%x %d    %d  '%c'%n",
                (int) asChar, (int) asChar, asInt, asChar);

        asChar = (char) (-'Z');
        asInt = -'Z';
        System.out.printf("-'Z' = \\x%x %d    %d  '%c'%n",
                (int) asChar, (int) asChar, asInt, asChar);

        asChar = (char) ('A' + ('Z' - 'A')/2);
        asInt = 'A' + ('Z' - 'A')/2;
        System.out.printf("'A' + ('Z' - 'A')/2%n     =   \\x%x    %d     %d  '%c'%n",
                (int) asChar, (int) asChar, asInt, asChar);

        asChar = (char) (-0x6f00);
        asInt = -0x6f00;
        System.out.printf("-0x6f00%n     = \\x%x %d %d  '%c'%n",
                (int) asChar, (int) asChar, asInt, asChar);

    }
}
