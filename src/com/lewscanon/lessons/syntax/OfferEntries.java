package com.lewscanon.lessons.syntax;

import java.util.Map;

public class OfferEntries {
    public static void main(String[] args) {
        Map<String, Integer> correlations = Map.ofEntries(
                Map.entry("two", 2),
                Map.entry("one", 1),
                Map.entry("three", 3)
        );
        System.out.printf("correlations: %s%n", correlations);
    }
}
