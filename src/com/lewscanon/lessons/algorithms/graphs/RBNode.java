/*
 * Copyright 2017, Lewis S. Bloch.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lewscanon.lessons.algorithms.graphs;

import static com.lewscanon.lessons.algorithms.graphs.RBNode.Color.BLACK;
import static com.lewscanon.lessons.algorithms.graphs.RBNode.Color.RED;

/**
 * Node type for Red-Black algorithms, with payload, pointers, and color.
 *
 * @param <K> Key type.
 * @param <P> Payload type.
 */
public class RBNode<K extends Comparable<K>, P> extends Node<K, P>
{
    private static final String ILLEGAL_COLOR = "Null color not allowed";

    /** Node color. */
    public enum Color
    {
        /** RED node. */    RED,
        /** BLACK node. */  BLACK,
        ;
    }

    /** {@code false} for {@link RED}, {@code true} for {@link BLACK}. */
    private boolean color;

    /**
     * Constructor, with key
     *
     * @param key key value - cannot be {@code null}.
     * @throws IllegalArgumentException for an illegal value of {@code key} (i.e., {@code null}).
     */
    public RBNode(K key)
    {
        super(key);
    }

    /**
     * Constructor, with key and payload.
     *
     * @param key key value - cannot be {@code null}.
     * @param payload containing a {key, payload} key-value pair.
     * @throws IllegalArgumentException for an illegal value of {@code key} (i.e., {@code null}).
     */
    public RBNode(K key, P payload)
    {
        super(key, payload);
    }

    /**
     * Get the color.
     * @return the color.
     */
    public Color getColor()
    {
        return color? BLACK : RED;
    }

    /**
     * Set the color.
     * @param color the color.
     * @throws IllegalArgumentException for an illegal value of {@code color} (i.e., {@code null}).
     */
    public void setColor(Color color)
    {
        if (color == null)
        {
            IllegalArgumentException exc = new IllegalArgumentException(ILLEGAL_COLOR);
            logger.error(ILLEGAL_COLOR, exc);
            throw exc;
        }
        this.color = color == BLACK;
    }

    /**
     * Test if the node color is {@link BLACK}.
     * @return true iff the node color is {@link BLACK}.
     */
    public boolean isBlack()
    {
        return color;
    }

    /**
     * Set the node color to {@link BLACK}.
     */
    public void makeBlack()
    {
        color = true;
    }

    /**
     * Test if the node color is {@link RED}.
     * @return true iff the node color is {@link RED}.
     */
    public boolean isRed()
    {
        return ! color;
    }

    /**
     * Set the node color to {@link RED}.
     */
    public void makeRed()
    {
        color = false;
    }

    /**
     * Rotate the given node to the right.
     * @param probe {@link Node} to rotate.
     * @return Node<K, P> the rotated node, or {@code null} if none.
     */
    public Node<K, P> rotateRight(Node<K, P> probe)
    {
        if (probe == null)
        {
            return null;
        }
        return probe;
    }

    /**
     * Rotate the given node to the left.
     *
     * @param probe {@link Node} to rotate.
     * @return Node<K, P> the rotated node, or {@code null} if none.
     */
    public Node<K, P> rotateLeft(Node<K, P> probe)
    {
        if (probe == null)
        {
            return null;
        }
        return probe;
    }

}
