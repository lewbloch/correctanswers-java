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

        char a = 'a';
        char b = 98;
        int ab= a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
        char ch = (char) 130000;
        int ich = ch;
        System.out.printf("ch = (char) 130000 == %c (%d, %x)%n", ch, ich, ich);
    }
}
