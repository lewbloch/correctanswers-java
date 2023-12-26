package com.lewscanon.lessons.algorithms;
/**
 * A function to rotate.
 * Copyright © 2023 Lewis S. Bloch.
 * @param <T> The type to rotate.
 */
@FunctionalInterface
public interface Rotator<T> {
    /**
     * Rotate a {@code T} instance.
     */
    T rotate(T original, int howFar);
}
