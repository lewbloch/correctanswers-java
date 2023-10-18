/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

@SuppressWarnings({"removal", "StringOperationCanBeSimplified", "JoinDeclarationAndAssignmentJava"})
public class Flailinize {
    public static void main(String[] args) throws InterruptedException {
        String str = new String("Java Developers Community");
        str = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("main");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }
}
