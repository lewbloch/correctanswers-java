package com.lewscanon.lessons.collectible;

import java.util.*;

public class Duplicata {
    public static void main(String... args) {
        final String OUTF = "%s = %s%n";

        List<String> seeds = List.of("Jack", "Jill", "Job", "Jill", "Bobo", "Hank");
        List<String> names = new LinkedList<>(seeds);
        Queue<String> priorities = new PriorityQueue<>(seeds);
        System.out.printf(OUTF, "names list", names);
        System.out.printf(OUTF, "priorities", priorities);
    }
}
