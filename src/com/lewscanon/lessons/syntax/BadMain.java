/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

import java.util.stream.Stream;

public class BadMain {
    public final static void main(final String...args){

        int x = 10;
        Stream.iterate(0, n -> n + 1 * x)
                .limit(10)
                .forEach(System.out::println);
//        x = 30;
    }

}
