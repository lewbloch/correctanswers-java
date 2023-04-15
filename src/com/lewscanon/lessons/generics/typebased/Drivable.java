/* Copyright © 2023 Lewis S. Bloch. */
package com.lewscanon.lessons.generics.typebased;

/** That it drives. */
public interface Drivable {
    /** Transmission. */
    enum Transmission {AUTOMATIC, MANUAL}

    /** Drive. */
    void drive();
}
