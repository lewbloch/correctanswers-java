package com.lewscanon.lessons.syntax;

public class StringTheory {
    public static void main(String[] args) {
        var modifyMe = "“hello how are you?”".toUpperCase().replace("hello", "bye");
        System.out.printf("Modified string: %s", modifyMe);
    }
}
