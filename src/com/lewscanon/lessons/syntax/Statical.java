package com.lewscanon.lessons.syntax;

@SuppressWarnings("AccessStaticViaInstance")
public class Statical {
    static class B {
        static String getText() {
            return "Hello";
        }
    }

    static class A extends B {
        static String getText() {
            return "World";
        }
    }

    public static void main(String... args) {
        B i = new A();
        A a = null;
        System.out.println(i.getText() + " " + a.getText());
    }
}
