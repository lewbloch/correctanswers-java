package com.lewscanon.lessons.syntax;

public class ReversiAnti {
    public static void main(String[] args) {
        String str = "Hello, LinkedIn!";
        int length = str.length();
        String reversed = "";

        for (int i = length - 1; i >= 0; i--) {
            //noinspection StringConcatenationInLoop
            reversed += str.charAt(i);
        }

        System.out.println(reversed);
    }
}
