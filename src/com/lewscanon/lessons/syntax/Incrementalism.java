package com.lewscanon.lessons.syntax;

public class Incrementalism {
    public static void main(String[] args) {
        incremadd();
        Integer frozz = callMe();
        System.out.printf("callMe(): %d%n", frozz);

        int x = 5;
        //noinspection ConstantValue
        System.out.printf("x++ + ++x - x-- - --x == %d", x++ + ++x - x-- - --x);

        multiIncremination();
    }

    static int callMe()
    {
        //noinspection ConstantConditionalExpression,DataFlowIssue
        return (true ? null : 0);
    }

    static void incremadd() {
        int a = 5;
        int b = a--;
        int c = ++a;
        int result = ++a + b + c;
        System.out.println(result);
    }

    static void multiIncremination() {
        int x = 10;
        int y = x++;
        int z = ++x;
        int result = x + y + z;
        System.out.printf("x %d, y %d, z %d, sum %d", x, y, z, result);
    }
}
