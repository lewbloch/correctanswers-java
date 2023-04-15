package com.lewscanon.lessons.functional;

public class FuncInter {
    public static void main(String args[]) {
        DoubleIt doubleIt = (num) -> num * 2;
        System.out.println("Double is " + doubleIt.doubleIt(2));
    }
}

@FunctionalInterface
interface DoubleIt {
    int doubleIt(int num);

    default void someFunc() {
        System.out.println("In Default");
    }

}
