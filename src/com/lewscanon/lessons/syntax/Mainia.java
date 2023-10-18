/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

public class Mainia {
    static public void main(String[] argie) {
        var rep = String.join(", ", argie);
        System.out.printf("with array of values: [%s]", rep);
    }

    @SuppressWarnings("ConfusingMainMethod")
    public static void main(String argie) {
        System.out.printf("with single value: \"%s\"", argie);
    }
}
