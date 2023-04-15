/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

interface MyInterface {
    void method1();
}

class MyClass {
    void method2() {
        System.out.println("Hello from MyClass!");
    }
}

class MyImplementation extends MyClass implements MyInterface {
    public void method1() {
        System.out.println("Hello from MyImplementation!");
    }
}

public class Implextender {
    public static void main(String[] args) {
        MyInterface obj = new MyImplementation();
        obj.method1();
//        obj.method2();
    }
}
