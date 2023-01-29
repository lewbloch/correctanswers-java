/* Copyright (c) 2023, Lewis S. Bloch. All rights reserved. */
package com.lewscanon.lessons.generics;

import java.util.*;
import java.util.function.Predicate;

/**
 * Implement a dynamic list similar to Java's {@link java.util.ArrayList}.
 * To study efficiency, memory usage, safety, concurrency, and tradeoffs.
 *
 * @param <T> the base type.
 */
public class DynamicList<T>
        implements List<T>,  Iterable<T>, RandomAccess {
    /** Default capacity. Package-private for testing purposes. */
    static final int DEFAULT_CAPACITY = 16;

    private Object[] internalList;
    private volatile int top = 0;

    /**
     * Constructor with default capacity.
     */
    public DynamicList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructor with initial capacity.
     * @param initialCapacity initial capacity.
     */
    public DynamicList(int initialCapacity) {
        this.internalList = new Object[initialCapacity];
    }

    @Override
    public synchronized int size() {
        assert top >= 0;
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top <= 0;
    }

    @Override
    public synchronized boolean contains(Object query) {
        boolean found = false;
        for (int idx = 0; !found && idx < top; ++idx) {
            found = Objects.equals(query, internalList[idx]);
        }

        return found;
    }

    @Override
    public Iterator<T> iterator() {
        final Object[] copy;
        synchronized (this) {
            copy = Arrays.copyOf(internalList, top);
        }
        //noinspection unchecked
        Iterator<T> iter = (Iterator<T>) Arrays.stream(copy).iterator();
        return iter;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return a;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
