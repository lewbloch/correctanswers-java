package com.lewscanon.lessons.syntax;

public class Strimmer {
    public static void main(String[] args) {
        String str=" ";
        str.trim();
        System.out.println(str.equals("")+" "+str.isEmpty());

        String txt = "Hello World";
        System.out.println(txt.toLowerCase());
    }
}
