// Copyright © 2023 Lewis S. Bloch.
package com.lewscanon.lessons.novelties;

/** Watch out for those semicolons! */
public class SemiColoner {
    public static void main(String[] args) {
        var foo = "Not a semicolon: ';'"    // ;
        ;   // uncomment the not-semicolon ----^ for a nice compiler error
        var bar = "Yes a semicolon: ';'";

        System.out.println("foo: " + foo);
        System.out.println("bar: " + bar);
    }
}
