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

/**
 * SAM for a {@code swap} method.
 * How to fit algorithm pieces together in real code.
 */
public interface Swapper
{
    /**
     * Swap a pair.
     *
     * @param pair Pair of {@code int}s to swap.
     */
    void swap(Pair pair);

    /**
     * Pair of integers.
     * Members are intentionally public and mutable.
     * Nested class to restrict it to where we require such looseness.
     */
    class Pair
    {
        /** Left element. */
        public int left;
        /** Right element. */
        public int right;

        /**
         * Constructor.
         */
        public Pair()
        {
        }

        /**
         * Constructor with initial values.
         *
         * @param lef int for the left.
         * @param rig int for the right.
         */
        public Pair(int lef, int rig)
        {
            this.left = lef;
            this.right = rig;
        }

        @Override public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if (! (other instanceof Pair))
            {
                return false;
            }
            Pair pair = (Pair) other;
            final boolean isSo = left == pair.left && right == pair.right;
            return isSo;
        }

        @Override public int hashCode()
        {
            final int hash = 31 * left + 89 * right;
            return hash;
        }

        @Override public String toString()
        {
            final String ret = "{" + left + ", " + right + "}";
            return ret;
        }
    }
}
