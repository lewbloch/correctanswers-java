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

/**
 * Basic tree operations.
 *
 * @param <K> Key type.
 * @param <P> Payload type.
 */
public interface Tree<K extends Comparable<K>, P>
{
    // Node operations

    /**
     * Get the root.
     *
     * @return Node<K, P> the root node, possibly {@code null}.
     */
    Node<K, P> getRoot();

    /**
     * Set the root.
     *
     * @param root the root node, possibly {@code null}.
     * @return Node<K, P> the root node, possibly {@code null}.
     */
    Node<K, P> setRoot(Node<K, P> root);

    // dictionary operations

    /**
     * Get the node that has the given key from the tree, or {@code null} if not found.
     *
     * @param key K.
     * @return Node<K, P> in the tree, by identity.
     */
    Node<K, P> get(K key);

    /**
     * Put a key/value pair into the tree, overwriting any previous value associated with the key.
     *
     * @param key K.
     * @param payload P associated with key.
     * @return Node<K, P> in the tree, by identity.
     */
    Node<K, P> put(K key, P payload);

    /**
     * Remove the node with the given key from the tree, returning the node removed
     *  or {@code null} if none were removed.
     *
     * @param key K.
     * @return Node<K, P> in the tree, by identity.
     */
    Node<K, P> remove(K key);

    default Node<K, P> putIfAbsent(K key, P payload)
    {
        final Node<K, P> found = get(key);
        return found != null ? found : put(key, payload);
    }
}
