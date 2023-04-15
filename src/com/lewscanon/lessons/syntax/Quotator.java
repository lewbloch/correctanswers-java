/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

public class Quotator {
    public static void main(String[] args) {
        String singler = "This is a single-quoted string's way";
        String escapedSingler = "This is a single-quoted string\'s way";
        System.out.printf("Without escape: %s%n Using escape: %s%n",
                singler, escapedSingler);
    }
}
