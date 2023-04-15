package com.lewscanon.lessons.functional;

import java.util.function.Function;

public class StaticizedFunc {
    static Function<Integer,Integer> func1 = n -> n + 3;
    static Function<Integer,Integer> func2 = n -> n * 6;
    public static void main(String... args) {
        System.out.println(func1.andThen(func2).apply(7));
    }
}
