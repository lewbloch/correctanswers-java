/*
 * Copyright © 2023 Lewis S. Bloch.
 */
package com.lewscanon.lessons.functional;

import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface Ranged {
    /**
     * Scales the range increment.
     * @param factor the scale factor.
     * @return the scaled increment.
     */
    int scale(int factor);
}

public class Ranger<E> {
    static final String NULL_SOURCE = "Null source";

    List<E> ranged;
    Integer start;
    Integer end;
    Integer increm;

    /**
     * Constructor of the ranged list.
     * @param source    source list.
     * @param start     start index.
     * @param end       end index.
     * @param increment range increment.
     */
    public Ranger(List<E> source, Integer start, Integer end, Integer increment) {
        if (ranged == null) {
            throw new NullPointerException(NULL_SOURCE);
        }

        this.start = start == null ? 0 : start;
        this.start = end == null ? 0 : end;
        this.start = start == null ? 0 : start;
    }
}
