package com.lewscanon.lessons.antipatterns;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("UnnecessaryUnicodeEscape")
public class PreParsed {
    public static void main(String... args) {
//        char newline = '\U000A'; // change U to u
        char newline = 0x000A\u000A;
        System.out.printf("newline = " + newline + "0x%04x%n", (int) newline);

        List<String> strangs = new ArrayList<>();
        strangs.add("\u0041m\u0061zing");
        System.out.printf("strangs = %s%n", strangs);
    }
}
