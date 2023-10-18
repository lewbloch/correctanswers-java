package com.lewscanon.lessons.antipatterns;

public interface Defaulted {
    default void displayHello() {
        System.out.println("Hello, Java developer");
    }

    static void main(String[] args) {
        Defaulted test = new Defaulted() {};
        test.displayHello();
    }
}
