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

import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Binary tree operations.
 *
 * @param <K> Key type.
 * @param <P> Payload type.
 */
public class BinaryTree<K extends Comparable<K>, P> implements Tree<K, P>
{
    private static final String ILLEGAL_ARGUMENT = "Illegal argument %s: must not be null";

    protected final Logger logger = Logger.getLogger(getClass().getSimpleName());

    Node<K, P> root;

    @Override
    public Node<K, P> getRoot()
    {
        return root;
    }

    @Override
    public Node<K, P> setRoot(Node<K, P> root)
    {
        this.root = root;
        return this.root;
    }

    // dictionary operations

    @Override
    public Node<K, P> get(K key) {
        return retrieve(getRoot(), key);
    }

    @Override
    public Node<K, P> put(K key, P payload) {
        return insert(getRoot(), key, payload);
    }

    @Override
    public Node<K, P> remove(K key) {
        return remove(getRoot(), key);
    }

    /**
     * Find the maximum node starting at the given node.
     * @param probe {@link Node} from which to find the maximum.
     * @return Node<K, P> maximum.
     */
    public Node<K, P> maximum(Node<K, P> probe)
    {
        if (probe != null)
        {
            while (probe.getRight() != null)
            {
                probe = probe.getRight();
            }
        }
        return probe;
    }

    /**
     * Find the minimum node starting at the given node.
     * @param probe {@link Node} from which to find the minimum.
     * @return Node<K, P> minimum.
     */
    public Node<K, P> minimum(Node<K, P> probe)
    {
        if (probe != null)
        {
            while (probe.getLeft() != null)
            {
                probe = probe.getLeft();
            }
        }
        return probe;
    }

    /**
     * Find the predecessor node to the given node.
     * @param probe {@link Node} for which to find the predecessor.
     * @return Node<K, P> predecessor, or {@code null} if none.
     */
    public Node<K, P> predecessor(Node<K, P> probe)
    {
        return probe == null ? null : maximum(probe.getLeft());
    }

    /**
     * Find the successor node to the given node.
     * @param probe {@link Node} for which to find the successor.
     * @return Node<K, P> successor, or {@code null} if none.
     */
    public Node<K, P> successor(Node<K, P> probe)
    {
        return probe == null ? null : minimum(probe.getRight());
    }

    /**
     * Insert the given key and payload into the tree rooted at {@code probe}.
     * The key must not be null
     *
     * @param probe Node beneath which to insert a new node. If {@code null}, set the root.
     * @param key Key to insert. May not be {@code null}.
     * @param payload Payload to insert. May be {@code null}.
     * @return Node inserted.
     */
    Node<K, P> insert(Node<K, P> probe, K key, P payload)
    {
        if (key == null)
        {
            final String msg = String.format(ILLEGAL_ARGUMENT, "key");
            IllegalArgumentException exc = new IllegalArgumentException(msg);
            logger.log(Level.SEVERE, msg, exc);
            throw exc;
        }
        if (probe == null)
        {
             setRoot(new Node<>(key, payload));
             return getRoot();
        }
        //noinspection ConstantValue
        assert key != null && probe != null;

        for (int compared; (compared = key.compareTo(probe.getKey())) != 0;)
        {
            Node<K, P> parent = probe;
            if (compared < 0)
            {
                probe = probe.getLeft();
                if (probe == null)
                {
                    probe = new Node<>(key, payload);
                    probe.setParent(parent);
                    parent.setLeft(probe);
                }
            }
            else
            {
                probe = probe.getRight();
                if (probe == null)
                {
                    probe = new Node<>(key, payload);
                    probe.setParent(parent);
                    parent.setRight(probe);
                }
            }
        }
        if (payload == null || ! payload.equals(probe.getPayload()))
        {
            probe.setPayload(payload);
        }
        return probe;
    }

    Node<K, P> remove(Node<K, P> probe, K key)
    {
        probe = retrieve(probe, key);
        if (probe != null)
        {
            final Node<K, P> parent = probe.getParent();

            if (probe.getLeft() == null)
            {
                if (probe.getRight() == null)
                {
                    if (parent != null) {
                        if (parent.getLeft() == probe)
                        {
                            parent.setLeft(null);
                        }
                        else
                        {
                            parent.setRight(null);
                        }
                    }
                }
                else
                {
                    probe.transplant(probe.getRight());
                }
            }
            else if (probe.getRight() == null)
            {
                probe.transplant(probe.getLeft());
            }
            else
            {
                Node<K, P> transplant = probe.transplant(predecessor(probe));
                transplant.setLeft(probe.getLeft());
                transplant.setRight(probe.getRight());
                if (transplant.getLeft() != null)
                {
                    transplant.getLeft().setParent(transplant);
                }
                if (transplant.getRight() != null)
                {
                    transplant.getRight().setParent(transplant);
                }
            }
        }
        return probe;
    }

    Node<K, P> retrieve(Node<K, P> probe, K query)
    {
        if (query == null)
        {
            return null;
        }
        for (int compared; probe != null && (compared = query.compareTo(probe.getKey())) != 0;)
        {
            probe = (compared < 0 ? probe.getLeft() : probe.getRight());
        }
        return probe;
    }

}
