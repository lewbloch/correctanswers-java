package com.lewscanon.lessons.syntax;

public class Gunal60 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = (i % 2 == 0) ? (x += i) : (y -= i);
        }
        System.out.println(x + y + result);
    }
}
