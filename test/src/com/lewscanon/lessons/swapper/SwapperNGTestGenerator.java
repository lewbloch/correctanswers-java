///*
// * Copyright 2016, Lewis S. Bloch.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.lewscanon.lessons.swapper;
//
//import org.testng.annotations.Factory;
//
//import com.lewscanon.lessons.swapper.swappers.PlusSwapper;
//import com.lewscanon.lessons.swapper.swappers.TimesSwapper;
//import com.lewscanon.lessons.swapper.swappers.XorSwapper;
//
///**
// * Test instance factory.
// */
//public class SwapperNGTestGenerator
//{
//    /**
//     * Test instance factory method.
//     *
//     * @return Object[] test instances, each with a different {@link Swapper} to test.
//     */
//    @Factory
//    public Object[] generateTests()
//    {
//        final Object[] tests =
//        {
//            new SwapperNGTest(new XorSwapper()),
//            new SwapperNGTest(new PlusSwapper()),
//            new SwapperNGTest(new TimesSwapper()),
//        };
//        return tests;
//    }
//
//}
