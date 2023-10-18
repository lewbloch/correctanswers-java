/*
 * Copyright © 2023, Lewis S. Bloch.
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
package com.lewscanon.lessons.novelties;

import java.util.Map;

import static java.util.stream.Collectors.toUnmodifiableMap;

public class Numeralator {
    private static final Map<Integer, Integer> DIGIT_VALUES;
    static {
        final String DIGITS = "０１２３４５６７８９";
        final int zero = DIGITS.codePointAt(0);
        DIGIT_VALUES = DIGITS.codePoints().boxed().collect(toUnmodifiableMap(
            codePoint -> codePoint, codePoint -> codePoint - zero, (a, b) -> b));
    }

    public static int parse(String digits) {
        final int base = 10;
        int sum = 0;
        for (int digit : digits.codePoints().boxed().map(DIGIT_VALUES::get).toList()) {
            sum = base * sum + digit;
        }
        return sum;
    }

    public static void main(String... args) {
        String testcase = "321";
        System.out.printf("\"%s\" -> %d%n", testcase, parse(testcase));

        testcase = "４０３０４７";
        System.out.printf("\"%s\" -> %d%n", testcase, parse(testcase));
    }
}
