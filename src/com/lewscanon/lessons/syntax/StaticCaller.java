package com.lewscanon.lessons.syntax;

class StaticCalled {
    static void callMe() {
        System.out.println("StaticCalled");
    }
}

public class StaticCaller {

    public static void main(String[] args) {
        StaticCalled b = null;
        b.callMe();
    }
}
