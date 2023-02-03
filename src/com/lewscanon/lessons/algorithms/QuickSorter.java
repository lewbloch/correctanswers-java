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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * Quicksort {@link Sorter}.
 *
 * @param <E> element type of collection to sort.
 */
public class QuickSorter<E extends Comparable<E>> implements Sorter<E, List<E>>
{
    /**
     * Pair of indexes.
     *
     * @param lox "Low" index.
     * @param hix "High" index.
     */
    record Pair(int lox, int hix) {
    }

    final Logger logger = Logger.getLogger(getClass().getSimpleName());

    /**
     * Sort a list in place.
     *
     * @param list to sort.
     * @return sorted list.
     */
    @Override
    public List<E> sort(List<E> list)
    {
        return quickSort(list);
    }

    /**
     * Quicksort algorithm, using {@link List}'s own indexes {@code 0} and {@code size()} to
     * initialize the low and high indexes traditionally seen as arguments.
     *
     * @param list to sort.
     * @return sorted list.
     */
    public List<E> quickSort(List<E> list)
    {
        final int size = list.size();
        logger.info("size " + size);
        logger.info(String.format("%s", list));

        if (size > 1)
        {
            Pair part = partition(list);
            final int subSize = part.hix + 1;   // list size is one more than high index
            if (subSize >= 2)           // if partition contains at least 2 elements
            {
                quickSort(list.subList(0, subSize));
            }
            if (part.lox + 2 < size)    // if partition contains at least 2 elements
            {
                quickSort(list.subList(part.lox, size));
            }
        }
        return list;
    }

    /**
     * Partitioning is done via {@link List#subList(int, int)} which is backed by the underlying
     * collection, so sorting sublists in place automatically sorts the overall list in place.
     * @param list collection to partition.
     * @return Pair of indexes around which to partition.
     */
    Pair partition(List<E> list)
    {
        final int size = list.size();
        assert size >= 2;

        final int pivin = size / 2;
        final E pivot = list.get(pivin);
        logger.info(String.format("pivot [%s]: \"%s\"", pivin, pivot));

        // set up indices as algorithm understands them
        int lox = 0;
        int hix = size- 1;
        while (lox <= hix)
        {
            for (E atLo = list.get(lox); pivot.compareTo(atLo) > 0;)
            {
                atLo = list.get(++lox);
            }
            for (E atHi = list.get(hix); pivot.compareTo(atHi) < 0;)
            {
                atHi = list.get(--hix);
            }
            logger.fine(String.format("{[%d], [%d]}", lox, hix));
            if (lox <= hix)
            {
                if (lox < hix)
                {
                    exchange(list, lox, hix);
                }
                ++lox;
                --hix;
            }
            logger.info(String.format("%s", list));
        }
        final Pair part = new Pair(lox, hix);
        logger.fine(String.format("partition [%s, %s]", part.lox, part.hix));
        return part;
    }

    /**
     * Exchange two elements in a list.
     *
     * @param list {@code List<E>} within which to exchange items.
     * @param lox  lower index of item to exchange.
     * @param hix  higher index of item to exchange.
     */
    void exchange(List<E> list, int lox, int hix)
    {
        final E lower = list.get(lox);
        final E higher = list.get(hix);
        list.set(lox, higher);
        list.set(hix, lower);
    }

    /**
     * Run the algorithm.
     *
     * @param args command arguments.
     */
    public static void main(String[] args)
    {
        final String[] stockExample = 
        {"Grant", "Bob", "Ziggy", "Alice", "teeny", "Frank", "Jo", "Diane", "Phil", "", };

        final List<String> strangs = Arrays.asList(args.length == 0 ? stockExample : args);
        QuickSorter<String> strangSorter = new QuickSorter<>();

        List<String> sorted = strangSorter.sort(new ArrayList<>(strangs));
        System.out.println(strangs);
        System.out.println(sorted);
    }
}
