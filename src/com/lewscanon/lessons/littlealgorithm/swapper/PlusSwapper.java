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

import com.lewscanon.lessons.littlealgorithm.Swapper;

/**
 * {@link Swapper} using additive operators.
 */
public class PlusSwapper implements Swapper
{
    @Override
    public void swap(Pair pair)
    {
        pair.left += pair.right;
        pair.right = pair.left - pair.right;
        pair.left -= pair.right;
    }    
}
