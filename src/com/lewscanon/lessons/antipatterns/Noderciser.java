package com.lewscanon.lessons.antipatterns;

class Node {
    Integer num;

    Node(Integer num) {
        this.num = num;
    }
}


public class Noderciser {
    static void first(Node n) {
        n = new Node(214);
    }

    static void second(Node n) {
        n.num = 214;
    }

    public static void main(String[] args) {
        Node node = new Node(213);
        System.out.println(node.num);

        first(node);
        System.out.println(node.num);

        second(node);
        System.out.println(node.num);
    }
}
