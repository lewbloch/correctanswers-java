/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

@SuppressWarnings({
        "JoinDeclarationAndAssignmentJava",
        "ReassignedVariable",
        "ReuseOfLocalVariable",
        "StringOperationCanBeSimplified",
        "TooBroadScope",
        "UnusedAssignment",
        "removal",
        "unused",
})
public class Flailinize {
    public static void main(String[] args) throws InterruptedException {
        String str = new String("Java Developers Community");
        str = null;
        System.gc();
        Thread.sleep(1000L);
        System.out.println("main");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize");
    }
}
