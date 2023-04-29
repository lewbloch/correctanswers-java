package com.lewscanon.lessons.syntax;

public class HowWePass {
    static void tryToChangeCallerArg(String value) {
        System.out.printf("value before: \"%s\"%n", value);
        value = value.replace("value, not ", "");
        System.out.printf("value change: \"%s\"%n", value);
    }
    public static void main(String... args) {
        String callByHow = "Called by value, not reference";
        System.out.printf("callByHow: \"%s\"%n", callByHow);
        tryToChangeCallerArg(callByHow);
        System.out.printf("callByHow: \"%s\"%n", callByHow);
    }
}
