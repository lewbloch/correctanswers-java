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

import java.util.Collection;

/**
 * Sorter SAM specification.
 *
 * @param <E> element type of collection to sort.
 * @param <T> collection type of collection to sort.
 */
public interface Sorter<E extends Comparable<E>, T extends Collection<E>>
{
    /**
     * Sort a collection using its natural sort order.
     *
     * @param collection {@code T} collection to sort.
     * @return T sorted collection.
     */
    T sort(T collection);
}
