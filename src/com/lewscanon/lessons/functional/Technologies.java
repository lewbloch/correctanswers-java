package com.lewscanon.lessons.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Technologies {
    int id;
    String tech;

    public Technologies(int id, String tech) {
        this.id = id;
        this.tech = tech;
    }

    @Override
    public String toString() {
        return this.id + " " + this.tech;
    }

    public static void main(String... args) {
        List<Technologies> list = Arrays.asList(new Technologies(1, "C"), new Technologies(2, "C++"), new Technologies(3, "Java"), new Technologies(4, "JavaScript"));

        List<String> name = list.stream()
                .filter(type -> type.tech.startsWith("J"))
                .map(t -> t.tech)
                .collect(Collectors.toList());
        System.out.print(name);
    }
}
