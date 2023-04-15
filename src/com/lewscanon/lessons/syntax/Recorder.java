package com.lewscanon.lessons.syntax;

public class Recorder {
    public static void main(String args[]) {
        var emp = new Employee("Elon Musk", 1);
//        var name = emp.getName();
//
//        System.out.println(name);
    }
}

record Employee(String name, int id){}
