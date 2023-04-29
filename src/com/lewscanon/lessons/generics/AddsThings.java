package com.lewscanon.lessons.generics;

import java.util.Arrays;
import java.util.List;

public class AddsThings {
    static final String RESULT = "%s raised to %s is %s%n";

    public static Double thingCalculator(Object... operands) {
        List<Object> things = Arrays.asList(operands);
        @SuppressWarnings("UnnecessaryLocalVariable")
        var result = things.get(0) instanceof Number base
                    && things.get(1) instanceof Number exponent ?
                Math.pow(base.doubleValue(), exponent.doubleValue()) : Double.NaN;
        return result;
    }

    public static Double numberCalculator(Number... operands) {
        List<Number> things = Arrays.asList(operands);
        return Math.pow(things.get(0).doubleValue(), things.get(1).doubleValue());
    }

    public static <B extends Number, E extends Number> Double genericCalculator(B base, E exponent) {
        List<Double> things = List.of(base.doubleValue(), exponent.doubleValue());
        return Math.pow(things.get(0), things.get(1));
    }

    public static void main(String... args) {
        Integer base = 42;
        Double exponent = 3.0;
        System.out.printf(RESULT, base, exponent, thingCalculator(base, exponent));
        System.out.printf(RESULT, base, exponent, numberCalculator(base, exponent));
        System.out.printf(RESULT, base, exponent, genericCalculator(base, exponent));
    }
}
