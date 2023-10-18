package com.lewscanon.lessons.syntax.multi;

public class InitOrderMain {
  static final String INITIAL;
  static {
    INITIAL = "Initialized";
    System.out.printf("INITIAL = \"%s\"%n", INITIAL);
  }

  public static void main(String[] args) {
    System.out.printf("Main: args.length %d%n", args.length);
    InitOrderFollow.showFollowed();
  }
}
