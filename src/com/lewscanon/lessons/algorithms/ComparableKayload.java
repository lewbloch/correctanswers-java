/*
 * Copyright 2017, Lewis S. Bloch.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lewscanon.lessons.algorithms;

/**
 * Comparable (therefore sortable/searchable) {@link Kayload} type.
 *
 * @param <K> Key type - must be {@link Comparable}{@code <K>}.
 * @param <P> Kayload type.
 */
public interface ComparableKayload<K extends Comparable<K>, P>
        extends Kayload<K, P>, Comparable<ComparableKayload<K, P>>
{
    @Override
    default int compareTo(ComparableKayload<K, P> other)
    {
        return other == null ? 1
            : this == other ? 0
            : getKey() == null ? (other.getKey() == null ? 0 : -1)
            : other.getKey() == null ? 1
            : getKey().compareTo(other.getKey());
    }

    default boolean eq(ComparableKayload<K, P> other)
    {
        return compareTo(other) == 0;
    }

    default boolean ge(ComparableKayload<K, P> other)
    {
        return compareTo(other) >= 0;
    }

    default boolean gt(ComparableKayload<K, P> other)
    {
        return compareTo(other) > 0;
    }

    default boolean le(ComparableKayload<K, P> other)
    {
        return compareTo(other) <= 0;
    }

    default boolean lt(ComparableKayload<K, P> other)
    {
        return compareTo(other) < 0;
    }

}
