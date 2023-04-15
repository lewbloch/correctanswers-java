/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

@SuppressWarnings({"StringEquality", "NewObjectEquality"})
public class Internimator {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = new String("java");
        System.out.print(s1 == s2);
        System.out.println(s1 == s2.intern());

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);

        double da = 1.0 / 17.9;
        double db = 1.0 / 19.7;
        System.out.println("da: " + da + ", db: " + db);

        da = da + db;
        db = da - db;
        da = da - db;
        System.out.println("da: " + da + ", db: " + db);
    }
}
