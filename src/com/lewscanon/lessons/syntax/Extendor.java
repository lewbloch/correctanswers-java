package com.lewscanon.lessons.syntax;

class Super {
    public int index = 1;
}

class Extendor extends Super {
        public Extendor(int index) {
            index = index;
        }

        public static void main(String args[]) {
            Extendor extendor = new Extendor(10);
            System.out.println(extendor.index);
        }
}
