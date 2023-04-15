package com.lewscanon.lessons.novelties;

abstract class t2 {
    final public void m2(){
        System.out.println("m2 is final method");
    }
    public void m3(){}
}

class temp extends t2{}

public abstract class Interface extends temp{
    public static void main(String[] args) {
        temp t= new temp();
        t.m2();
    }
}
