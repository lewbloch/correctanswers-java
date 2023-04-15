/* Copyright © 2023 Lewis S. Bloch. */

package com.lewscanon.lessons.syntax;

public class InitOrder {
    public static void main(String... args) {
        A obj = new B();
        System.out.printf("obj.x = %s%n", obj.x);
    }

    static class A {
        int x = 4;
    }

    static class B extends A {
        int x = 10;
    }
}
