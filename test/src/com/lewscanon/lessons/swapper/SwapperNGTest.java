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
package com.lewscanon.lessons.swapper;

import com.lewscanon.lessons.swapper.Swapper;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.lewscanon.lessons.swapper.Swapper.Pair;
import com.lewscanon.lessons.swapper.swappers.PlusSwapper;
import com.lewscanon.lessons.swapper.swappers.Provider;
import com.lewscanon.lessons.swapper.swappers.TimesSwapper;
import com.lewscanon.lessons.swapper.swappers.XorSwapper;

import static org.testng.Assert.assertEquals;

/**
 * Test the {@link XorSwapper}.
 */
public class SwapperNGTest
{
    // Messages

    private static final String BAD_SWAPPER = "Invalid swapper";

    // Date
    private static final String DATAP = "provider";

    private final Logger logger = LogManager.getLogger(getClass().getSimpleName());
    private final Provider provider = new Provider(logger);

    private final Swapper swapper;


    /**
     * Constructor with {@link Swapper} to test.
     *
     * @param swapper {@link Swapper} to test.
     */
    public SwapperNGTest(Swapper swapper)
    {
        if (swapper == null)
        {
            final IllegalArgumentException exc =
                    new IllegalArgumentException(BAD_SWAPPER, new NullPointerException());
            logger.error(BAD_SWAPPER, exc.getCause());
            throw exc;
        }
        this.swapper = swapper;
        assert this.swapper != null : BAD_SWAPPER;
    }

    /**
     * Test swap method of {@link XorSwapper}.
     *
     * @param pair {@link Pair} to test.
     */
    @Test(dataProvider = DATAP)
    public void testSwap(Pair pair)
    {
        Pair swappee = new Pair(pair.left, pair.right);
        Pair expected = new Pair(pair.right, pair.left);

        swapper.swap(swappee);
        assertEquals(swappee, expected, "Swap failure");
    }

    @DataProvider(name = DATAP)
    Object[][] provideData(Method test)
    {
        return provider.provideData(test);
    }
}
