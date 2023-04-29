package com.lewscanon.lessons.syntax;

public class Cup {
    static final String FILLED = "Cup contains %f%n";

    public static void fillCup(Cup cup) {
        if (cup != null) {
            cup.fill(1.0);
        }
    }

    private double full;

    public void fill(double value) {
        full = value;
    }

    public double pour() {
        return full;
    }

    public static void main(String... args) {
        Cup cup = new Cup();
        System.out.printf(FILLED, cup.pour());
        Cup.fillCup(cup);
        System.out.printf(FILLED, cup.pour());
    }
}
