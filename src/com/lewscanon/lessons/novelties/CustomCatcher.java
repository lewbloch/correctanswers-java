package com.lewscanon.lessons.novelties;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Catch {
    Class<? extends Throwable>[] value();
}

public class CustomCatcher {
    public static void main(String[] args) {
        CustomCatcher example = new CustomCatcher();
        example.performDivision();
    }

    @Catch({ArithmeticException.class})
    public void performDivision() {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
