/*
 * Copyright 2016, Lewis S. Bloch.
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
package com.lewscanon.lessons.littlealgorithm.swapper;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lewscanon.lessons.littlealgorithm.Swapper;
import com.lewscanon.lessons.littlealgorithm.Swapper.Pair;

import static org.testng.Assert.assertEquals;

/**
 * Test the {@link PlusSwapper}.
 */
public class PlusSwapperNGTest
{
    private static final String DATAP = "provider";

    private final Logger logger = Logger.getLogger(getClass().getSimpleName());

    /**
     * Test of swap method, of class XorSwapper.
     *
     * @param pair Pair to test.
     */
    @Test(dataProvider = DATAP)
    public void testSwap(Pair pair)
    {
        Swapper swapper = new PlusSwapper();

        Pair swappee = new Pair(pair.left, pair.right);
        Pair expected = new Pair(pair.right, pair.left);

        swapper.swap(swappee);
        assertEquals(swappee, expected, "Swap failure");
    }

    @DataProvider(name = DATAP)
    Object[][] provideData(Method test)
    {
        final Object[][] data = new Object[][]
        {
            { new Pair(17, 89) },
            { new Pair(0, 1) },
            { new Pair(1, 0) },
            { new Pair(0, 0) },
            { new Pair(-1, 1) },
            { new Pair(Integer.MAX_VALUE / 2 + 1, Integer.MAX_VALUE / 2) },
            { new Pair(Integer.MIN_VALUE / 2 + 1, Integer.MIN_VALUE / 2) },
        };
        return data;
    }
}
