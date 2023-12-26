package com.lewscanon.lessons.algorithms;

import java.util.Arrays;

/**
 * Demonstrate rotating an array.
 * Copyright © 2023 Lewis S. Bloch. All rights reserved.
 */
public class RotArrayan {
    private static int posMod(int input, int modend) {
        if (modend <= 0) {
            throw new IllegalArgumentException(String.format("Illegal modend %d", modend));
        }
        @SuppressWarnings("UnnecessaryLocalVariable")
        final int posmod = input < 0 ? modend - (modend - input) % modend
                : input % modend;
        return posmod;
    }

    private static final Rotator<int[]> rotator = (orig, dist) -> {
        if (orig == null) {
            return null;
        }
        if (dist == 0 || orig.length == 0) {
            return Arrays.copyOf(orig, orig.length);
        }

        final int[] target = new int[orig.length];
        for (int ix = 0, jx = posMod(dist, orig.length); ix < orig.length; ++ix, ++jx) {
            final int nx = jx % orig.length;
            target[nx] = orig[ix];
        }
        return target;
    };

    @SuppressWarnings("ConstantValue")
    public static void main(String[] args) {
        final String SHOWF = "%s rotate %3d -> %s%n";

        final int[] test1 = {-7, -2, 1, 3, 4, 11, 13};
        final int[] howFars = {3, 0, 2, -2, -2 - test1.length};
        for (int howFar : howFars) {
            System.out.printf(SHOWF, Arrays.toString(test1), howFar,
                    Arrays.toString(rotator.rotate(test1, howFar)));
        }

        final int[] empty = {};
        int howFar = 0;
        System.out.printf(SHOWF, Arrays.toString(empty), howFar, Arrays.toString(rotator.rotate(empty, howFar)));
        howFar = 2;
        System.out.printf(SHOWF, Arrays.toString(empty), howFar, Arrays.toString(rotator.rotate(empty, howFar)));
        howFar = -2;
        System.out.printf(SHOWF, Arrays.toString(empty), howFar, Arrays.toString(rotator.rotate(empty, howFar)));

        final int[] nolo = null;
        howFar = 0;
        System.out.printf(SHOWF, Arrays.toString(nolo), howFar, Arrays.toString(rotator.rotate(nolo, howFar)));
        howFar = 2;
        System.out.printf(SHOWF, Arrays.toString(nolo), howFar, Arrays.toString(rotator.rotate(nolo, howFar)));
        howFar = -2;
        System.out.printf(SHOWF, Arrays.toString(nolo), howFar, Arrays.toString(rotator.rotate(nolo, howFar)));
    }
}
