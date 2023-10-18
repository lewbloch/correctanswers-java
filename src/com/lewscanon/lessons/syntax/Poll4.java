package com.lewscanon.lessons.syntax;

@SuppressWarnings("ImplicitArrayToString")
public class Poll4 {

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(ch1);
        System.out.println(ch1 + " " + ch2);
        System.out.println(String.valueOf(ch1) + " " + String.valueOf(ch2));
        System.out.println(ch1.toString() + " " + ch2.toString());
    }
}
