package com.lewscanon.lessons.syntax;

public class Substrang {
    public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("e", 5));

        myStr = "An engineer basically is an inventor. The rest depends on the branch of engineering.";
        System.out.println(myStr.indexOf("e", 8));
    }
}
