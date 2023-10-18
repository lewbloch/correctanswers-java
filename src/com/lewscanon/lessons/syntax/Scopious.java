package com.lewscanon.lessons.syntax;

public class Scopious {
    public static void main(String... args) {
        int x = 9;
        //noinspection ConstantValue
        if (false) {
//            int x = 8;
            System.out.println(x);
        }
    }
}
