package com.lewscanon.lessons.syntax;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressWarnings("MismatchedReadAndWriteOfArray")
public class Emptiness {

    public static void main(String... args) {
        Foo[] items = {};
        System.out.printf("items = %s%n", Arrays.toString(items));
    }
}

class Foo {
    static final AtomicInteger fooKount = new AtomicInteger(0);

    static {
        System.out.println("Foo initializing");
    }

    final int position;

    Foo() {
        System.out.printf("Foo instance initializing%n");
        position = fooKount.getAndIncrement();
    }
}
