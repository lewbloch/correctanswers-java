package com.lewscanon.lessons.novelties;

@SuppressWarnings("unchecked")
public class ExceptionTest {
    public static void main(String... args) {
        Thread.currentThread()
                .setUncaughtExceptionHandler((t, throwable) -> System.out.println(throwable.getClass().getSimpleName()));
        badMethod();
        System.out.println("No Exception");
    }

    @SuppressWarnings("RedundantTypeArguments")
    private static void badMethod() {
        ExceptionTest.<RuntimeException>throwException();
    }

    @SuppressWarnings("UnusedReturnValue")
    private static <E extends Throwable> E throwException() throws E {
        throw (E) new Exception();
    }
}
