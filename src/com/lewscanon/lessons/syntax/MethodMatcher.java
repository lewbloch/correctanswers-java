package com.lewscanon.lessons.syntax;

class DifferentType {
    public void display(int x, int y) {
        System.out.println("Method 3");
    }

    public void display(double x, double y) {
        System.out.println("Method 4");
    }
}

public class MethodMatcher {
    public static void print(Object obj) {

        System.out.println(obj);

    }
    public static void main(String[] args) {
        DifferentType example2 = new DifferentType();
        example2.display(10, 20.0);
        example2.display(15.5, 5);

        print(123);

    }
}
