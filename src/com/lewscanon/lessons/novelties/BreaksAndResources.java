package com.lewscanon.lessons.novelties;

public class BreaksAndResources {
    public static void main(String[] args) throws Exception {
        outer:
        {
            inner:
            try (AutoCloseable x = () -> System.out.print("1")) {
                if (true) break outer;
            } finally {
                System.out.print(",2");
                if (true) break inner;
            }
            System.out.print(",3");
        }
    }

}
