package com.lewscanon.lessons.syntax;

@SuppressWarnings({"CommentedOutCode", "unused", })
public class StaticalNesting {
  interface Textable {
    static void getText() {
        final var text = "Texter text";
        System.out.println(text);
    }
  }

  static class Texter implements Textable {}

  public static void main(String... args) {

    Textable.getText();

    Textable textable = new Textable() {};
//    textable.getText();           // Compilation error
//    new Textable() {}.getText();  // Compilation error

    Textable nuhUh = null;
//    nuhUh.getText();              // Compilation error

//    Texter.getText();             // Compilation error

    Texter texter = new Texter();
//    texter.getText();             // Compilation error
  }
}
