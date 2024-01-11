package com.lewscanon.lessons.algorithms;

import java.util.List;

/** Digit reversal for integral numerals. */
public class IntegerReverser {
    /**
     * Reverse the digits of a numeral in a given radix for the given number.
     * @param argument the integer to reverse.
     * @param radix the number base for the numeral.
     */
    public static long reverse(long argument, int radix) {
        return reverse(Long.toUnsignedString(argument, radix), radix);
    }

    /**
     * Reverse the digits of a numeral in a given radix for the given number.
     * @param numeral representation of the integer to reverse, in the given radix.
     * @param radix the number base for the numeral.
     */
    public static long reverse(String numeral, int radix) {
        return Long.parseUnsignedLong(new StringBuilder(numeral).reverse().toString(), radix);
    }

    public static void main(String... args) {
        final String SHOWME = "radix %d %n %012d\t%32s %nreversed%n %012d\t%32s%n";
        final String EXPECT = " %d Matches? %b %n%n";

        for (Radixal radixal : testCases) {
            final long argument = Long.parseLong(radixal.value(), radixal.radix());
            final long reversed = reverse(argument, radixal.radix());
            final String revernumer = Long.toUnsignedString(reversed, radixal.radix());

            System.out.printf(SHOWME, radixal.radix(), argument, radixal.value(), reversed, revernumer);
            System.out.printf(EXPECT, radixal.expected(), reversed == radixal.expected());

        }
    }

    record Radixal(String value, int radix, long expected){}

    static final List<Radixal> testCases = List.of(
        new Radixal("00000010100101000001111010011100", 2, 964176192L),
        new Radixal("11111111111111111111111111111101", 2, 3221225471L)
    );
}
