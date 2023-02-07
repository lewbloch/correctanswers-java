package com.lewscanon.lessons.syntax;

public class ExplodingCompilationErrors {

    public static void main(String... args) {
        checkEmDashes();
        checkBadQuotes();
    }

    static void checkEmDashes() {

        /* as published on LinkedIn */
//        Int x = 4, y = 3, z = 2;
//        Int result = x + y++ - —z * —x;

        /* corrected */
        int x = 4, y = 3, z = 2;
        @SuppressWarnings({"ReassignedVariable", "UnusedAssignment"})
        int result = x + y++ - --z * --x;

        System.out.println(result);
    }

    static void checkBadQuotes() {
        int Integer = 24;

        /* as published on LinkedIn */
//        char String = ‘x’;

        /* corrected */
        char String = 'x';

        System.out.print(Integer);
        System.out.println(String);

//        char ch = ′x′;
        char ch = 'x';
        System.out.println("ch: '" + ch + "'");
    }
}
