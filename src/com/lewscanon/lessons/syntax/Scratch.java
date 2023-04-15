/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.syntax;

import java.util.stream.Stream;

public class Scratch {
    public enum Game
    {
        CRICKET (1),
        FOOTBALL(2);

        private int value;

        Game(int value) { this.value = value; }

        public static Game data(int val)
        {
            return Stream.of(Game.values())
                    .filter(type -> type.value == val)
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException (" Invalid Input"));
        }}
    public static void main(String... args)
    {
        System.out.print(Game.data(2));
    }
}
