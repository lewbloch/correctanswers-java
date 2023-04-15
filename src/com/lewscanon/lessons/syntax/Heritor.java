package com.lewscanon.lessons.syntax;

/** Grandparent of Leaf. */
class Grand {
    /** Constructor. */
    public Grand() {
        System.out.printf("%n%s", Grand.class.getSimpleName());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

/** Parent of Leaf. */
class Parent extends Grand {
    /** Constructor. */
    public Parent() {
        System.out.printf("%n%s", Parent.class.getSimpleName());
    }
}

/** Leaf. */
class Leaf extends Parent {
    /** Constructor. */
    public Leaf() {
        System.out.printf("%n%s", Leaf.class.getSimpleName());
    }
}

/** Constructor behavior with derived classes. */
public class Heritor {

    /**
     * Drive the demo.
     * @param args Command arguments.
     */
    public static void main(String... args) {
        final String FMT = "%nI'm a %s!%n";

        Leaf leaf = new Leaf();
        System.out.printf(FMT, leaf);

        Grand grandLeaf = new Leaf();
        System.out.printf(FMT, grandLeaf);

        Grand grandParent = new Parent();
        System.out.printf(FMT, grandParent);

        Grand grandGrand = new Grand();
        System.out.printf(FMT, grandGrand);
    }
}
