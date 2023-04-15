/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

public class Defaultless {
    int value = 10;
    public Defaultless(int value) {
        System.out.printf("Count = %d%n", value);
        System.out.printf("Count = %d%n", this.value);
    }

    public static void main(String[] args) {
//        Defaultless defaultless = new Defaultless();
    }
}
