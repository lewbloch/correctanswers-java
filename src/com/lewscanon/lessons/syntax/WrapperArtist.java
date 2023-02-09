package com.lewscanon.lessons.syntax;

/** Playing with the standard numeric wrapper types. */
@SuppressWarnings({"WrapperTypeMayBePrimitive", "ConstantValue", "NumberEquality"})
public class WrapperArtist
{
    /**
     * Play with integer representations.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        final String FORMAT = "%n%s == %s? %b";

        int primThree = 3;
        int primThird = 3;
        Integer wrapThree = 3;
        Integer wrapThird = 3;
        Integer wrapDivid = 27 / 9;

        System.out.printf(FORMAT, "primThree", "primThird", primThree == primThird);
        System.out.printf(FORMAT, "wrapThree", "wrapThird", wrapThree == wrapThird);
        System.out.printf(FORMAT, "wrapThree", "wrapDivid", wrapThree == wrapDivid);
    }
}
