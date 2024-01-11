package com.lewscanon.lessons.syntax;

public class NestedPrivacy {
    private static class Internal {
        public static void announce() {
            System.out.println("Inside Internal");
        }
    }
    static class Intermittent extends Internal {
        public static void announce() {
            System.out.println("Inside Intermittent");
        }
    }
}
