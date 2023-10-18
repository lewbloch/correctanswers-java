package com.lewscanon.lessons.antipatterns;

public class ConstraMethodology {
    ConstraMethodology() {
        print();
    }

    void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        ConstraMethodology constra = new ConstraMethodology();
        constra.print();
    }
}
