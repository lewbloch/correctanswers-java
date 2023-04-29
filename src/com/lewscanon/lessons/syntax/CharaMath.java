package com.lewscanon.lessons.syntax;

/** Explore equality. */
@SuppressWarnings("ConstantValue")
public class CharaMath {
/**
 * Experiment with char math.
 * @param args command arguments.
 */
  public static void main(String... args) {
    char a = 'a';
    char b = 'b';
    char ab = (char) (a + b);
    System.out.printf("a: '%c', b: '%c', ab: '%c', equals 'Ã'? %b%n",
            a, b, ab, ab == 'Ã');
  }
}
