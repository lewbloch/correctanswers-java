package com.lewscanon.lessons.antipatterns;

@SuppressWarnings({"unused", "ClassInitializerMayBeStatic"})
class A {
    static int i = m2();

    A() {
        System.out.println("A");
    }

    int m1() {
        System.out.println("B");
        return 10;
    }

    static {
        System.out.println("C");
    }

    int j = m1();

    {
        System.out.println("D");
    }

    static int m2() {
        System.out.println("E");
        return 10;
    }
}

public class InitializerMania {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        A a1 = new A();
    }
}
