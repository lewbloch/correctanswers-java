/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.generics;

/** Run-time type token (RTTT) magic. */
public class Dynerics<T> {
    private static final String ERR_NULL_TYPE = "Null type token is illegal";
    private static final String ERR_ILLEGAL_TYPE = "Illegal type '%s', requires '%s'";

    private final Class<T> token;
    private final Class<T[]> arrayToken;

    /**
     * Constructor with run-time type token (RTTT).
     * @param type the RTTT, cannot be {@code null}.
     */
    @SuppressWarnings("unchecked")
    public Dynerics(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException(new NullPointerException(ERR_NULL_TYPE));
        }
        this.token = type;
        this.arrayToken = (Class<T[]>) this.token.arrayType();
    }

    /**
     * Convert an array to the type.
     * @param candidate array to convert.
     * @return an array of the type with the contents of the argument.
     */
    public T convert(Object candidate) {
        if (candidate == null) {
            return null;
        }
        final var componentType = candidate.getClass();
        if (!token.isAssignableFrom(componentType)) {
            throw new IllegalArgumentException(String.format(ERR_ILLEGAL_TYPE,
                    componentType.getName(), token.getName()));
        }
        return token.cast(candidate);
    }

    /**
     * Convert an array to the type.
     * @param candidates array to convert.
     * @return an array of the type with the contents of the argument.
     */
    public T[] convert(Object[] candidates) {
        if (candidates == null) {
            return null;
        }
        final var componentType = candidates.getClass().getComponentType();
        if (!token.isAssignableFrom(componentType)) {
            throw new IllegalArgumentException(String.format(ERR_ILLEGAL_TYPE,
                    componentType.getName(), token.getName()));
        }
        return arrayToken.cast(candidates);
    }
}
