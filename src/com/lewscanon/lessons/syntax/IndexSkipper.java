package com.lewscanon.lessons.syntax;

public class IndexSkipper {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
