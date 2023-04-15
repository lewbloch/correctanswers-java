package com.lewscanon.lessons.algorithms;
public class Reverser {
  public record Numeral(String numeral, int base, int value) {
  }

  public static final Integer BASE_D = 10;

  public Numeral reverse(int value) {
    return reverse(value, null);
  }

  public Numeral reverse(Numeral value) {
    return value == null ? null : reverse(value.value, value.base);
  }

  public Numeral reverse(int value, Integer base) {
    if (base == null) {
      return reverse(value, BASE_D);
    }
    if (base < 2) {
      throw new IllegalArgumentException(String.format(
        "Illegal base %d, must be at least 2", base));
    }

    final var rev = new StringBuilder(Integer.toString(value, base)).reverse().toString();
    return new Numeral(rev, base, Integer.valueOf(rev, base));
  }

  public static void main(String... args) {
    final String ARI1 = "reverse(%d) -> %s%n";
    final String ARI2 = "reverse(%d, %d) -> %s%n";
    final String ARI3 = "reverse(%s) -> %s%n";
    final Reverser reverser = new Reverser();

    int eg = 154;
    Integer base = 12;
    System.out.println();
    System.out.printf(ARI1, eg, reverser.reverse(eg));

    Numeral reversed = reverser.reverse(eg, base);
    System.out.printf(ARI2, eg, base, reversed);
    System.out.printf(ARI3, reversed, reverser.reverse(reversed));

    base = 16;
    System.out.printf(ARI2, eg, base, reverser.reverse(eg, base));
    reversed = reverser.reverse(eg, base);
    System.out.printf(ARI3, reversed, reverser.reverse(reversed));
  }
}
