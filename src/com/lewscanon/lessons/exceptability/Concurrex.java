package com.lewscanon.lessons.exceptability;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/** {@code ConcurrentModificationException} exploration. */
public class Concurrex {
    public static void main(String... args) {
        final Map<Integer, String> map = new ConcurrentHashMap<>(Map.of(0, "Void",
                -1, "Myzkltpz",
                1, "Shiva", 2, "Jaanu", 3, "Ahriman", 4, "Zoroaster"
        ));

        Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();
        for (int kt = 0; iter.hasNext(); ++kt) {
            if (kt == 0) {
                map.clear();
                continue;
            }
            var entry = iter.next();
            System.out.printf("Current entry: %d -> \"%s\"%n", entry.getKey(), entry.getValue());
//            map.put(-1, "zptlkzyM");
            if (entry.getValue().equals("Shiva")) {
                iter.remove();
                System.out.printf("Removed %s%n", map.remove(2));
            }
            else if (kt == 3){
                System.out.printf("Removed %s%n", map.remove(kt + 1));
            }
        }
    }
}
