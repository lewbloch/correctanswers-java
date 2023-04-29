package com.lewscanon.lessons.generics;

public class Statigen {
    public static <T> void manipulo() {
        @SuppressWarnings("unchecked")
        T thingy = (T) "Oy, gevalt";
        System.out.printf("Unchecked cast to T: %s%n", thingy);
    }

    public static <T> void castigate() {
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) new Object(){}.getClass().getEnclosingClass();
        System.out.println("Class name: " + clazz.getSimpleName());
    }
    public static void main(String[] args) {
        Statigen.<CharSequence> manipulo();
        Statigen.<CharSequence> castigate();
    }
}
