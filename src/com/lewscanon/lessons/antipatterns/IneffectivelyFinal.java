package com.lewscanon.lessons.antipatterns;

@SuppressWarnings("CodeBlock2Expr")
public class IneffectivelyFinal {
    public static void main(String[] args) {
        int num = 10;
        Runnable r = () -> {
            System.out.println(num);
        };
//        num = 20;
        new Thread(r).start();
    }
}
