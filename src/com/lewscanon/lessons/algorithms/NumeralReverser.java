package com.lewscanon.lessons.algorithms;

/**
 * Reversal of the digits of a numeral.
 */
public class NumeralReverser {
    /** A number and its numeral. */
    public record Numeral(String numeral, int base, int value) {
        static final String REPRESENT = "{ 'numeral': %s, 'base': %d, 'value': %d }";

        @Override
        public String toString() {
            return String.format(REPRESENT, numeral, base, value);
        }
    }

    /** The default base. */
    public static final Integer BASE_DEFAULT = 10;

    private static final String BAD_BASE = "Illegal base %d, must be at least 2";

    /**
     * Reverse the digits of a numeral representing the given number and convert to a number.
     * @param value the number whose digits to reverse, using the default base.
     */
    public Numeral reverse(int value) {
        return reverse(value, null);
    }

    /**
     * Reverse the digits of a numeral representing the given number and convert to a number.
     */
    public Numeral reverse(int value, Integer base) {
        if (base == null) {
            return reverse(value, BASE_DEFAULT);
        }
        if (base < 2) {
            throw new IllegalArgumentException(String.format(BAD_BASE, base));
        }
        var reversed = new StringBuilder(Integer.toString(value, base)).reverse().toString();
        @SuppressWarnings("UnnecessaryLocalVariable")
        final Numeral result = new Numeral(reversed, base, Integer.valueOf(reversed, base));
        return result;
    }

    /**
     * Exercise the logic.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        final String FORMAT = "reverse(%d) -> %s%n";
        final String FORMAT_BASED = "reverse(%d, %d) -> %s%n";
        final String FORMAT_BASED_NULL = "reverse(%d, null) -> %s%n";

        final NumeralReverser numeralReverser = new NumeralReverser();

        System.out.println();
        int example = 7331;
        System.out.printf(FORMAT, example, numeralReverser.reverse(example));

        System.out.printf(FORMAT_BASED_NULL, example, numeralReverser.reverse(example, null));
        System.out.printf(FORMAT_BASED, example, NumeralReverser.BASE_DEFAULT, numeralReverser.reverse(example));

        Integer base = 16;
        System.out.printf(FORMAT_BASED, example, base, numeralReverser.reverse(example, base));
        base = 12;
        System.out.printf(FORMAT_BASED, example, base, numeralReverser.reverse(example, base));

        System.out.println();
        example = 145;
        System.out.printf(FORMAT, example, numeralReverser.reverse(example));

        System.out.printf(FORMAT_BASED_NULL, example, numeralReverser.reverse(example, null));
        System.out.printf(FORMAT_BASED, example, NumeralReverser.BASE_DEFAULT, numeralReverser.reverse(example));

        base = 16;
        System.out.printf(FORMAT_BASED, example, base, numeralReverser.reverse(example, base));
        base = 12;
        System.out.printf(FORMAT_BASED, example, base, numeralReverser.reverse(example, base));

        example = 146;
        System.out.printf(FORMAT_BASED, example, base, numeralReverser.reverse(example, base));

    }
}
