/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

import java.util.List;
public class MainIsntFirst {

    static final List<String> options = List.of("Winken", "Blinken", "Nod");

    public static void main(String... args) {

        System.out.printf("Options: %s%n", options);

    }
}
