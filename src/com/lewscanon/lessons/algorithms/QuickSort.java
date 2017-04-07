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
 * Binary {@link Sorter}.
 *
 * @param <E> element type of collection to sort.
 */
public class QuickSort<E extends Comparable<E>> implements Sorter<E, List<E>>
{
    private static final String LOHI = "{[{}], [{}]}";

    final Logger logger = LogManager.getLogger(getClass());

    @Override
    public List<E> sort(List<E> list)
    {
        List<E> result = new ArrayList(list);
        quickSort(result);

        logger.info("sorted\n");
        logger.info("{}", list);
        logger.info("{}\n", result);
        return result;
    }

    void quickSort(List<E> list)
    {
        final int size = list.size();
        logger.info("quickSort size {}: {}", size, list);
        if (size <= 1)
        {
            return;
        }

        int part = partition(list);
        quickSort(list.subList(0, part));
        quickSort(list.subList(part + 1, size));
    }

    int partition(List<E> list)
    {
        if (list.size() < 2)
        {
            logger.info("partition [0]: {}\n", list);
            return 0;
        }
        final int pivin = list.size() / 2;
        final E pivot = list.get(pivin);

        int lo = -1;
        int hi = list.size();

        logger.debug("pivot [{}]: \"{}\"", pivin, pivot);
        logger.debug(LOHI + "\n", lo, hi);

        while (true)
        {
            for (E atLo = list.get(++lo); pivot.compareTo(atLo) > 0; atLo = list.get(++lo)) {}
            for (E atHi = list.get(--hi); pivot.compareTo(atHi) < 0; atHi = list.get(--hi)) {}

            logger.debug(LOHI + ": {\"{}\", \"{}\"}", lo, hi, list.get(lo), list.get(hi));
            try
            {
                if (lo >= hi)
                {
                    logger.info("partition [{}]: {}\n", hi, list);
                    return hi;
                }
                final E lower = list.get(lo);
                final E higher = list.get(hi);
                list.set(lo, higher);
                list.set(hi, lower);
            }
            finally
            {
                logger.debug("{}\n", list);
            }
        }
    }

    /**
     * Run the algorithm.
     *
     * @param args command arguments.
     */
    public static void main(String[] args)
    {
        final String[] stockExample = {"Grant", "Bob", "Ziggy", "Alice", "Frank", "Jo", "Diane"};

        final List<String> strangs = Arrays.asList(args.length == 0 ? stockExample : args);
        QuickSort<String> strangSorter = new QuickSort<>();
        strangSorter.sort(strangs);
    }
}
