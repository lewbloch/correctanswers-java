package com.lewscanon.lessons.syntax;

public class SkipElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (i % 2 == 0) {
                continue;
            }
            sum += 10;
        }
        System.out.println(sum);
    }
}
