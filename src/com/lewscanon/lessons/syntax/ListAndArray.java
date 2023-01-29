package com.lewscanon.lessons.syntax;

import java.util.Arrays;
import java.util.List;

public class ListAndArray {
    /**
     * Demonstrate how an array shows as a string.
     * @param args program arguments.
     */
    public static void main(String ... args) {
        String[] items = {"Zero", "One", "Two"};
        System.out.println("items: " + Arrays.toString(items));
        List<String> strangs = Arrays.asList(items);
        System.out.println("List version: " + strangs);
    }
}
