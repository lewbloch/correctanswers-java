/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

public class Mainia {
    public static void main(String[] argie) {
        var rep = String.join(", ", argie);
        System.out.printf("with array of values: [%s]", rep);
    }

    public static void main(String argie) {
        System.out.printf("with single value: \"%s\"", argie);
    }
}
