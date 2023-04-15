/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.functional;

import java.util.function.BiFunction;

class Arithmetic {
    public static int plus(int a, int b) {
        return a + b;
    }
}

public class BiFunky {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        final String FMT = "%16s.apply(%d, %d) == %d%n";

        BiFunction<Integer, Integer, Integer> addition = Arithmetic::plus;

        int addend = 10;
        int augend = 20;
        int result = addition.apply(addend, augend);
        System.out.printf(FMT, "Arithmetic::plus", addend, augend, result);

        addition = BiFunky::plus;
        addend = 17;
        augend = 33;
        result = addition.apply(addend, augend);
        System.out.printf(FMT, "BiFunky::plus", addend, augend, result);
    }
}
