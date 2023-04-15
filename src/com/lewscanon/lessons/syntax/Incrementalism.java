package com.lewscanon.lessons.syntax;

public class Incrementalism {
    public static void main(String[] args) {
//        incremadd();
//        Integer frozz = callMe();

        int x = 5;
        System.out.printf("x++ + ++x - x-- - --x == %d", x++ + ++x - x-- - --x);
    }

    static int callMe()
    {
        return (true ? null : 0);
    }

    static void incremadd() {
        int a = 5;
        int b = a--;
        int c = ++a;
        int result = ++a + b + c;
        System.out.println(result);
    }
}
