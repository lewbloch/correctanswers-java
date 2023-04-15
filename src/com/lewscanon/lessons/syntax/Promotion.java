/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

public class Promotion {

    private static final String CHAR_TO_INT = "Char '%c' %s promotes to int %d (%x)%n";
    public static void main(String[] args) {
        char letter = 'm';
        int promoted = +letter;
        System.out.printf(CHAR_TO_INT, letter, "   with +", promoted, promoted);

        promoted = letter;
        System.out.printf(CHAR_TO_INT, letter, "without +", promoted, promoted);
    }
}
