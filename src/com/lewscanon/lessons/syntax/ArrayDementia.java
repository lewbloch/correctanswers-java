package com.lewscanon.lessons.syntax;

public class ArrayDementia {
    public static void main(String[] args) {
        String[][] arrArr = {
                {"one", "two", "three"},
                {"one"}
        };
        printar(arrArr);

        String[][] arrTwoDee = new String[2][];
        arrTwoDee[0] = new String[] {"three", "two", "one"};
        arrTwoDee[1] = new String[] {"liftoff!"};
        printar(arrTwoDee);

        String[] empty = {};
        System.out.printf("Length of array 'empty' == %d%n", empty.length);
    }

    static void printar(String[][] arrorery) {
        System.out.println("{");
        for (String[] line : arrorery) {
            System.out.print("  { ");
            for (String item : line) {
                System.out.printf("\"%s\" ", item);
            }
            System.out.println("}");
        }
        System.out.println("}");

    }
}
