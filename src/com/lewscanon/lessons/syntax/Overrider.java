package com.lewscanon.lessons.syntax;

class A {
    void m1() {
        System.out.println("A class m1");
    }
}

class B extends A {
    void m1() {
        System.out.println("B class m1");
    }
}

public class Overrider {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
