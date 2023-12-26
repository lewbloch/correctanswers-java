package com.lewscanon.lessons.syntax.mathing;

public class DoubleMath {
    public static void main(String... args) {
        fractol();
    }

    public static void fractol() {
        final double FRACT = 0.899;
        final double FRACTOL = Math.sqrt(1.0/9.0);
        System.out.printf("%f finv(f(x)) -> %f%n", FRACT, Math.sqrt(FRACT) * Math.sqrt(FRACT));
        System.out.printf("%f finv(f(x)) -> %f%n", FRACTOL, Math.sqrt(FRACTOL) * Math.sqrt(FRACTOL));
    }
}
