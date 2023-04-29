package com.lewscanon.lessons.generics;

import java.util.ArrayList;

@SuppressWarnings({"rawtypes", "unchecked"})
public class RawDeal {
    public static void main(String... args) {
        ArrayList al = new ArrayList<String>();
        al.add(10);
        al.add(true);
        al.add("Hello");
        System.out.println(al);
    }
}
