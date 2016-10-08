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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.lewscanon.lessons.littlealgorithm.Swapper;

import static com.lewscanon.lessons.littlealgorithm.Swapper.Pair;

/**
 * Data providers available to all.
 *
 * Instantiate to use - this allows local data providers to fully control what happens.
 */
public class Provider
{
    private static final String ENTRY_MSG = "%s( %s )";

    private final Logger logger;

    /**
     * Constructor.
     *
     * @param logger {@link Logger} with default being one for {@link DataProviders}.
     */
    public Provider(Logger logger)
    {
        this.logger = logger == null ? LogManager.getLogger(getClass().getSimpleName()) : logger;
        assert this.logger != null;
    }

    /**
     * Generate {@link Swapper.Pair} instances.
     *
     * @param test {@link Method} about to run.
     * @return Object[][] data.
     */
    public Object[][] provideData(Method test)
    {
        if (logger.isDebugEnabled())
        {
            final String message = String.format(ENTRY_MSG, "provideData", test.getName());
            logger.debug(message);
        }
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
