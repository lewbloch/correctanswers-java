package com.lewscanon.lessons.monsters;

import java.util.Objects;

public class OrderedException extends RuntimeException implements Comparable<OrderedException> {
  public OrderedException() {
    super();
  }

  public OrderedException(String message) {
    super(message);
  }

  @SuppressWarnings("unused")
  public OrderedException(Throwable cause) {
    super(cause);
  }

  @SuppressWarnings("unused")
  public OrderedException(String message, Throwable cause) {
    super(message, cause);
  }

  @Override
  public String toString() {
    final String MESSF = "Ordex %s";
    return String.format(MESSF, getMessage());
  }

  @Override
  public int hashCode() {
    final var message = getMessage();
    return message == null ? 0 : message.hashCode();
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof OrderedException othex && Objects.equals(getMessage(), othex.getMessage());
  }

  @Override
  public int compareTo(OrderedException other) {
    if (other == null) {
      return 1;
    }
    if (this == other) {
      return 0;
    }
    final var message = getMessage();
    final var otherMessage = other.getMessage();
    if (message == null) {
      return otherMessage == null ? 0 : -1;
    }
    if (otherMessage == null) {
      return 1;
    }
    return message.compareTo(otherMessage);
  }

  @SuppressWarnings("EqualsWithItself")
  public static void main(String... args) {
    final OrderedException ordex = new OrderedException();
    final OrderedException ordex0 = new OrderedException("Alpha");
    final OrderedException ordex00 = new OrderedException("Alpha");
    final OrderedException ordex1 = new OrderedException("Zeta");

    final String COMPF = "%-12.12s to %-12.12s = %-3d%n";

    System.out.printf(String.format(COMPF, ordex, ordex, ordex.compareTo(ordex)));
    System.out.printf(String.format(COMPF, ordex, ordex0, ordex.compareTo(ordex0)));
    System.out.printf(String.format(COMPF, ordex0, ordex, ordex0.compareTo(ordex)));
    System.out.printf(String.format(COMPF, ordex0, ordex00, ordex0.compareTo(ordex00)));
    System.out.printf(String.format(COMPF, ordex0, ordex1, ordex0.compareTo(ordex1)));
    System.out.printf(String.format(COMPF, ordex1, ordex0, ordex1.compareTo(ordex0)));
    System.out.printf(String.format(COMPF, ordex0, null, ordex0.compareTo(null)));
  }
}
