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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Quicksort {@link Sorter}.
 *
 * @param <E> element type of collection to sort.
 */
public class QuickSort<E extends Comparable<E>> implements Sorter<E, List<E>>
{
    private static final String LOHI = "{[{}], [{}]}";

    /** Pair of indexes. */
    static class Pair
    {
        /** "Low" index. */
        final int lox;
        /** "High" index. */
        final int hix;
        Pair(int lox, int hix)
        {
            this.lox = lox;
            this.hix = hix;
        }
    }

    final Logger logger = LogManager.getLogger(getClass());

    @Override
    public List<E> sort(List<E> list)
    {
        List<E> result = new ArrayList(list);
        quickSort(result);

        logger.info("{}", list);
        logger.info("sorted");
        logger.info("{}\n", result);
        return result;
    }

    /**
     * Quicksort algorithm, using {@link List}'s own indexes {@code 0} and {@code size()} to
     * initialize the low and high indexes traditionally seen as arguments.
     *
     * @param list of {@code E} items to sort.
     */
    List<E> quickSort(List<E> list)
    {
        final int size = list.size();
        logger.info("quickSort size {}", size);
        logger.info("{}", list);
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
        logger.info("pivot [{}]: \"{}\"", pivin, pivot);

        // set up indices as algorithm understands them
        int lox = 0;
        int hix = size- 1;
        while (lox <= hix)
        {
            for (E atLo = list.get(lox); pivot.compareTo(atLo) > 0; atLo = list.get(++lox))
            {
                logger.debug("[{}]: \"{}\"", lox, atLo);
            }
            for (E atHi = list.get(hix); pivot.compareTo(atHi) < 0; atHi = list.get(--hix))
            {
                logger.debug("[{}]: \"{}\"", hix, atHi);
            }
            logger.info(LOHI, lox, hix);
            if (lox <= hix)
            {
                if (lox < hix)
                {
                    exchange(list, lox, hix);
                }
                ++lox;
                --hix;
            }
            logger.info("{}", list);
        }
        final Pair part = new Pair(lox, hix);
        logger.info("partition [{}, {}]\n", part.lox, part.hix);
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
        QuickSort<String> strangSorter = new QuickSort<>();
        strangSorter.sort(strangs);
    }
}
