package com.lewscanon.lessons.syntax;

public class Reversi {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
