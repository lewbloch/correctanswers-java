package com.lewscanon.lessons.syntax;

public class StringTheory {
    public static void main(String... args) {
        var modifyMe = "“hello how are you?”".toUpperCase().replace("hello", "bye");
        System.out.printf("Modified string: %s%n", modifyMe);

        String language = "Java";
        String languageBits = "Ja" + "va";
        //noinspection StringEquality
        System.out.printf("\"%s\" == \"%s\" is %b%n", language, languageBits, language == languageBits);

        String result = 5 + 10 + "Hello" + 5 + 10;
        System.out.println(result);
    }
}
