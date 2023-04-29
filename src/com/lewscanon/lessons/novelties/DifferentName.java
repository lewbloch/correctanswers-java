package com.lewscanon.lessons.novelties;

@SuppressWarnings("InstantiationOfUtilityClass")
class DifferentlyNamed {
    /**
     * The file and class names differ.
     */
    public static void main(String... args) {
        DifferentlyNamed named = new DifferentlyNamed();
        System.out.printf("The file name here is DifferentName, but the class name is %s%n",
                named.getClass().getName());
    }
}
