package com.lewscanon.lessons.idioms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResourceTrial {
    public static void readIn() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (String seen = reader.readLine(); seen != null; seen = reader.readLine()) {
                System.out.printf("Seen: %s%n", seen);
            }
        }
    }

    public static void main(String... args) {
        try {
            readIn();
        }
        catch (IOException exc) {
            System.out.printf("I/O Exception: %s%n", exc);
        }
    }
}
