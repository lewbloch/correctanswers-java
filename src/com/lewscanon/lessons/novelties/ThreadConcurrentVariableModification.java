package com.lewscanon.lessons.novelties;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class ThreadConcurrentVariableModification {
    static long value1 = 10;

    public static void main(String... args) {
        var value2 = new AtomicLong(0);
        final long[] value3 = {0};
        final long[] value4 = {0};
        IntStream.range(1, 100).parallel().forEach(a -> value1++);
        System.out.println(value1);//1
        IntStream.range(1, 100).parallel().forEach(a -> value2.incrementAndGet());
        System.out.println(value2);//2
        IntStream.range(1, 100).parallel().forEach(a -> value3[0]++);
        System.out.println(value3[0]);//3
        IntStream.range(1, 100).parallel().forEach(a -> value4[0] = incrementAndGet(value4[0]));
        System.out.println(value4[0]);//4
    }

    private static synchronized Long incrementAndGet(Long number) {
        return ++number;
    }
}
