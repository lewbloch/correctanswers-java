package com.lewscanon.lessons.novelties;

import static java.lang.System.out;

@SuppressWarnings("ReassignedVariable")
public class PuzzleSwap {
  private static final String FXY = "%d %-17s x = %4d, y = %4d%n";
  private static final String INI = "initialize";

  @SuppressWarnings("SuspiciousNameCombination")
  public static void main(String[] args) {
    int x, y;

    x = 2014;
    y = 2023;
    out.printf(FXY, 0, INI, x, y);
    x ^= y ^= x ^= y;
    out.printf(FXY, 1, "x ^= y ^= x ^= y", x, y);
    out.println();

    x = 2014;
    y = 2023;
    out.printf(FXY, 0, INI, x, y);
    y ^= x ^= y;
    out.printf(FXY, 1, "y ^= x ^= y", x, y);
    out.println();
  }
}
