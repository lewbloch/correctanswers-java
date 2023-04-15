package com.lewscanon.lessons.novelties;

public class NestedShaper {
    public static abstract class Shape {

        private int surface;
        public Shape() {
            this.surface = computeSurface();
        }

        protected abstract int computeSurface();
        private int getSurface() {
            return surface;
        }
    }
    public static class SquareShape extends Shape {
        private final int size;

        public SquareShape(int size) {
            this.size= size;
        }

        @Override
        protected int computeSurface() {
            return size * size;
        }
    }
}
