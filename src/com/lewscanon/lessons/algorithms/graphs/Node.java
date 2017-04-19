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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lewscanon.lessons.algorithms.Kayload;

/**
 * Node type with payload and pointers.
 *
 * @param <K> Key type.
 * @param <P> Payload type.
 */
public class Node<K extends Comparable<K>, P> implements Kayload<K, P>
{
    private static final String ILLEGAL_KEY = "Null key not allowed";

    protected final Logger logger = LogManager.getLogger(getClass());

    protected final K key;
    protected P payload;

    protected Node<K, P> left;
    protected Node<K, P> right;
    protected Node<K, P> parent;

    /**
     * Constructor, with key and payload.
     *
     * @param key key value - cannot be {@code null}.
     * @throws IllegalArgumentException for an illegal value of {@code key} (i.e., {@code null}).
     */
    public Node(K key)
    {
        this(key, null);
    }

    /**
     * Constructor, with key and payload.
     *
     * @param key key value - cannot be {@code null}.
     * @param payload containing a {key, payload} key-value pair.
     * @throws IllegalArgumentException for an illegal value of {@code key} (i.e., {@code null}).
     */
    public Node(K key, P payload)
    {
        if (key == null)
        {
            IllegalArgumentException exc = new IllegalArgumentException(ILLEGAL_KEY);
            logger.error(ILLEGAL_KEY, exc);
            throw exc;
        }
        this.key = key;
        this.payload = payload;
        assert this.key != null;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj == null || ! getClass().isAssignableFrom(obj.getClass()))
        {
            return false;
        }
        final Node<?, ?> other = (Node<?, ?>) obj;
        return this.getKey().equals(other.getKey());
    }

    @Override
    public int hashCode()
    {
        return hash();
    }

    @Override
    public K getKey()
    {
        return key;
    }

    @Override
    public P getPayload()
    {
        return payload;
    }

    @Override
    public void setPayload(P payload)
    {
        this.payload = payload;
    }

    /**
     * Get the left pointer.
     * @return the left pointer.
     */
    public Node<K, P> getLeft()
    {
        return left;
    }

    /**
     * Set the left pointer.
     * @param left the left pointer to set.
     */
    public void setLeft(Node<K, P> left)
    {
        this.left = left;
    }

    /**
     * Get the right pointer.
     * @return the right pointer.
     */
    public Node<K, P> getRight()
    {
        return right;
    }

    /**
     * Set the right pointer.
     * @param right the right pointer to set.
     */
    public void setRight(Node<K, P> right)
    {
        this.right = right;
    }

    /**
     * Get the parent pointer.
     * @return the parent pointer.
     */
    public Node<K, P> getParent()
    {
        return parent;
    }

    /**
     * Set the parent pointer.
     * @param parent the parent pointer to set.
     */
    public void setParent(Node<K, P> parent)
    {
        this.parent = parent;
    }

    /**
     * Transplant a node into this one's place.
     * @param node Node to transplant.
     * @return Node<K, P> transplanted node.
     */
    public Node<K, P> transplant(Node<K, P> node)
    {
        if (node.parent != null) {
            if (node.parent.left == node)
            {
                node.parent.left = null;
            }
            else
            {
                node.parent.right = null;
            }
        }
        node.parent = parent;
        if (parent != null)
        {
            if (parent.left == this)
            {
                parent.left = node;
            }
            else
            {
                parent.right = node;
            }
        }
        return node;
    }

}
