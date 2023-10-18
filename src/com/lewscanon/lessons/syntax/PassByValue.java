package com.lewscanon.lessons.syntax;

public class PassByValue {
  static class Holdit {
    private final String held;

    public Holdit(String toHold) {
      this.held = toHold;
    }

    @Override
    public String toString() {
      final String FMT = "%s{%s}";
      return String.format(FMT, getClass().getSimpleName(), held);
    }
  }

  static final String TESTF = "prime: %s, infra: %s%n";

  static void swill(Holdit prime, Holdit infra) {
    System.out.printf("swill " + TESTF, prime, infra);
    prime = new Holdit("swillprime");
    infra = new Holdit("swillinfra");
    System.out.printf("swill " + TESTF, prime, infra);
  }

  public static void main(String[] args) {
    Holdit prime = new Holdit("prime");
    Holdit infra = new Holdit("infra");
    System.out.printf("main  " + TESTF, prime, infra);
    swill(prime, infra);
    System.out.printf("main " + TESTF, prime, infra);
  }
}
