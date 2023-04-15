package com.lewscanon.lessons.novelties;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        var email = "test@testcom";
        System.out.println(predicate1.and(predicate2).test(email));
    }

    static Predicate<String> predicate1 = email -> email.contains("@");
    static Predicate<String> predicate2 = email -> email.contains(".");
}
