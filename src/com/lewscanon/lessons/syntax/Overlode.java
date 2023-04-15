/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

public class Overlode {
    public static void main(String[] args) {
        test(null);
    }

    public static void test(Object o) {
        System.out.println("Object method");
    }

//    public static void test(Integer s) {
//        System.out.println("Integer method");
//    }

    public static void test(String s) {
        System.out.println("String method");
    }
}
