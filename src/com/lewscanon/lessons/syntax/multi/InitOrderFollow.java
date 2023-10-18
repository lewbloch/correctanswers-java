package com.lewscanon.lessons.syntax.multi;

public class InitOrderFollow {
  public static final String FOLLOWED;
  static {
    FOLLOWED = "Following initialization";
    System.out.printf("FOLLOWED = \"%s\"%n", FOLLOWED);
  }

  public static void showFollowed() {
    System.out.printf("showFollowed = \"%s\"%n", FOLLOWED);
  }
}
