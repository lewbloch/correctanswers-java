package com.lewscanon.lessons.syntax;

public class Voidity {
  public static void main(String[] args) {
    final String FMT = "The primitivity of %s is %b%n";
    System.out.printf(FMT, void.class.getSimpleName(), void.class.isPrimitive());
    System.out.printf(FMT, Void.class.getSimpleName(), Void.class.isPrimitive());
  }
}
