package com.lewscanon.lessons;

public class Example {
    public static void main(String... haha) {
        if (haha.length == 0) {
            System.out.println("No arguments");
        }
        else {
            System.out.println("Arguments are:");
            for (String hehe : haha) {
                System.out.println(hehe);
            }
        }
    }
}
