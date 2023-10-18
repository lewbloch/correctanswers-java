package com.lewscanon.lessons.syntax;

public class NoPrintReturn {
    public static void main(String[] args) {
        //noinspection StatementWithEmptyBody
        if (System.out.printf("Java Language%n") == null) {
        }
    }
}
