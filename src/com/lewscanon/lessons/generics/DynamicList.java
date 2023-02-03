/* Copyright (c) 2023, Lewis S. Bloch. All rights reserved. */
package com.lewscanon.lessons.generics;

import java.util.*;

/**
 * Implement a dynamic list similar to Java's {@link java.util.ArrayList}.
 * To study efficiency, memory usage, safety, concurrency, and tradeoffs.
 *
 * @param <T> the base type.
 */
@SuppressWarnings({"unchecked", "unused"})
public class DynamicList<T>
        implements List<T>,  Iterable<T>, RandomAccess {

    /** Default capacity. Package-private for testing purposes. */
    static final int DEFAULT_CAPACITY = 16;

    static final int THRESHOLD_PINK = Integer.MAX_VALUE / 2;
    static final int THRESHOLD_RED = THRESHOLD_PINK + THRESHOLD_PINK / 2;
    static final int THRESHOLD_YELLOW = THRESHOLD_PINK - THRESHOLD_PINK / 3;
    static final String TOO_LARGE =
            "List size has reached capacity of " + THRESHOLD_RED + " items";
    static final String TOO_NEGATIVE = "List size has dropped below zero";

    private T[] internalList;
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
        //noinspection unchecked
        this.internalList = (T[]) new Object[initialCapacity];
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
        final T[] copy;
        synchronized (this) {
            copy = Arrays.copyOf(internalList, top);
        }
        return Arrays.stream(copy).iterator();
    }

    @Override
    public Object[] toArray() {
        final T[] copy;
        synchronized (this) {
            copy = Arrays.copyOf(internalList, top);
        }
        return copy;
    }

    @Override
    public <T1> T1[] toArray(T1[] proto) {
        final Object[] copy = toArray();
        return (T1[]) copy;
    }

    @Override
    public synchronized boolean add(T t) {
        if (top == internalList.length) {
           if (! upCap()) {
               return false;
           }
        }
        internalList[top++] = t;
        return true;
    }

    @Override
    public synchronized boolean remove(Object o) {
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
    public synchronized void clear() {
        this.internalList = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public synchronized T get(int index) {
        return index < 0 || index >= top ? null : internalList[index];
    }

    @Override
    public synchronized T set(int index, T element) {
        return null;
    }

    @Override
    public synchronized void add(int index, T element) {

    }

    @Override
    public synchronized T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object search) {
        T query = (T) search;
        for (int idx = 0; idx < top; ++idx) {
            if (Objects.equals(query, internalList[idx])) {
                return idx;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        final T[] copy;
        synchronized (this) {
            copy = Arrays.copyOf(internalList, top);
        }
        return Arrays.asList(copy).listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        if (index > top) {
            throw new IllegalArgumentException("Index " + index + " must be less than " + index);
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index " + index + " must be at least zero");
        }
        throw new UnsupportedOperationException("listIterator()");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        final T[] sub = Arrays.copyOfRange(internalList,
                Math.max(0, fromIndex), Math.min(toIndex, top));
        return Arrays.asList(sub);
    }

    synchronized boolean upCap() {
        final int capacity = internalList.length;
        if (capacity >= THRESHOLD_RED) {
            return false;
        }
        final int newlen = capacity >= THRESHOLD_PINK ?
                THRESHOLD_RED : (capacity + capacity / 2);
        internalList = Arrays.copyOf(internalList, newlen);
        return true;
    }

    synchronized boolean downCap() {
        assert internalList.length >= DEFAULT_CAPACITY;
        assert top >= 0 : TOO_NEGATIVE;

        if (internalList.length == DEFAULT_CAPACITY) {
            return true;
        }

        final int capacity = top + top / 2;
        if (capacity < internalList.length) {
            internalList = Arrays.copyOf(internalList, capacity);
        }
        return true;
    }
}
