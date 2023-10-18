/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

@SuppressWarnings({
        "JoinDeclarationAndAssignmentJava",
        "ReassignedVariable",
        "ReuseOfLocalVariable",
        "StringOperationCanBeSimplified",
        "removal",
        "unused",
        "TooBroadScope", })
public class Flailinize {
    @SuppressWarnings("UnusedAssignment")
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
