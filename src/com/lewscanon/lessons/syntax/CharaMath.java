package com.lewscanon.lessons.syntax;

/** Experiment with char math. */
public class CharaMath {
  public static void main(String... args) {
    charAddendum();
    charAdditum();
    charOver();

    @SuppressWarnings("UnnecessaryLocalVariable")
    char toBox = 0x46;
    Character wasBoxed = toBox;
    System.out.printf("wasBoxed = %s%n", wasBoxed);
  }

  @SuppressWarnings("ConstantValue")
  public static void charAddendum() {
    char a = 'a';
    char b = 'b';
    char ab = (char) (a + b);
    System.out.printf(
      "a: '%c', b: '%c', ab: '%c', equals 'Ã'? %b%n",
      a, b, ab, ab == 'Ã');
  }

  public static void charAdditum() {
    int i = 10;
    int j = 25;
    System.out.print("charAdditum: ");
    System.out.println(i + ' ' + j);
  }

  public static void charOver() {
    int ivalue = 0xFFFFFFFF + 0xFFFFFFFF;
    System.out.printf("ivalue = %d%n", ivalue);
    int cvalue = (char) (0xFFFFFFFF + 0xFFFFFFFF);
    System.out.printf("cvalue = %d%n", cvalue);
    System.out.printf("  cast = %d%n", (int)(char) (0xFFFFFFFF + 0xFFFFFFFF));
  }
}
