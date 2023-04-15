/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

@SuppressWarnings("ComparisonToNaN")
public class Nanner {
    private static final String FMT = "%s => %b%n";

    public static void main(String[] args) {
        var eq = Float.NaN == Float.NaN;
        System.out.printf(FMT, "Float.NaN == Float.NaN", eq);

        var ne = Float.NaN != Float.NaN;
        System.out.printf(FMT, "Float.NaN != Float.NaN", ne);
    }
}
