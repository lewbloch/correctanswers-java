package com.lewscanon.lessons.syntax;

import java.util.ArrayList;
import java.util.List;

/** Fun stuff with final lists. */
public class Finalist {
    public static void main(String... args) {
        final List<String> names = new ArrayList<>(List.of(
                "Jill", "Jack", "Sleepy", "Doc"));
        names.add("Jack");
        names.add("Kay");
        names.add("Jill");
        names.remove("Jack");
        System.out.printf("Adjusted names: %s", names);
    }
}
