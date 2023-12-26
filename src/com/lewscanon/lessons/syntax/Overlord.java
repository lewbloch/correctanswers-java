package com.lewscanon.lessons.syntax;

public class Overlord {

    public static void main(String[] args) {
        Base base = new Derived();
        base.display();
    }
}

class Base {
    void display() {
        System.out.println("Derived");
    }
}

class Derived extends Base {
    void display() {
        System.out.println("Base");
    }
}
