package com.lewscanon.lessons.syntax;

@SuppressWarnings({"ConstantValue", "TooBroadScope"})
public class Charolus {
    public static void main(String[] args) {
        char zerou = '\u0000';
        char zeroe = 0;
        int zeroy = 0;
        System.out.printf("zerou = %d%n", (int) zerou);
        System.out.printf("zeroe = %d%n", (int) zeroe);
        System.out.printf("zerou == zeroe? %b%n", zerou == zeroe);
        System.out.printf("zerou == zeroy? %b%n", zerou == zeroy);

        System.out.println();
    }
}
