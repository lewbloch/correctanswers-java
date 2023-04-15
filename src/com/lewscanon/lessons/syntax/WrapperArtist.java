package com.lewscanon.lessons.syntax;

/** Playing with the standard numeric wrapper types. */
@SuppressWarnings({"WrapperTypeMayBePrimitive", "ConstantValue", "NumberEquality"})
public class WrapperArtist
{
    static final String FORMAT = "%n%s %d == %s %d ? %b";

    /**
     * Play with integer representations.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        boxing();
        increBoxing();
    }

    static void boxing() {
        int primThree = 3;
        int primThird = 3;
        Integer wrapThree = 3;
        Integer wrapThird = 3;
        Integer wrapDivid = 27 / 9;

        System.out.printf(FORMAT, "primThree", primThree ,"primThird", primThird, primThree == primThird);
        System.out.printf(FORMAT, "wrapThree", wrapThree, "wrapThird", wrapThird, wrapThree == wrapThird);
        System.out.printf(FORMAT, "wrapThree", wrapThree, "wrapDivid", wrapDivid, wrapThree == wrapDivid);
    }

    static void increBoxing() {
        Integer threshold = 127;
        Integer thresheld = 127;
        System.out.printf(FORMAT, "threshold", threshold, "thresheld", thresheld, threshold == thresheld);

        threshold += 1;
        thresheld += 1;
        System.out.printf(FORMAT, "threshold", threshold, "thresheld", thresheld, threshold == thresheld);
    }
}
