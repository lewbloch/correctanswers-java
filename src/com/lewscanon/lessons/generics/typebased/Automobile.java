/*
 * Copyright © 2023 Lewis S. Bloch.
 */

package com.lewscanon.lessons.generics.typebased;

/** Automobile model. */
public interface Automobile extends Drivable {
    /** Body style. */
    enum BodyStyle { SEDAN, COUPE, WAGON, SUV}
}
