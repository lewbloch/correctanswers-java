package com.lewscanon.lessons.antipatterns;

class IncompletelyInitialize {
 final String INITTEDFMT = getClass().getSimpleName() + " instance initialized? %b%n";

 boolean instInitted;

 public IncompletelyInitialize() {
  System.out.printf(INITTEDFMT, isInstInitted());
 }

 public boolean isInstInitted() {
  return instInitted;
 }

 public void setInstInitted(boolean instInitted) {
  this.instInitted = instInitted;
 }
}

public class IncompleteChild extends IncompletelyInitialize {

 public IncompleteChild() {
  setInstInitted(true);
 }

 public static void main(String... args) {
  IncompleteChild child = new IncompleteChild();
  System.out.printf(child.INITTEDFMT, child.instInitted);
 }
}
