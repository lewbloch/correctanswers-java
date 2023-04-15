/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.functional;

import java.util.List;

public class FlatMapper {
    public static void main(String[] args) {
        withFlatMap();
    }

    static List<List<String>> lists = List.of(
            List.of("mylist1", "mylist2")
    );

    public static void withFlatMap() {
        List<String> collectLists = lists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(collectLists);
    }
}
