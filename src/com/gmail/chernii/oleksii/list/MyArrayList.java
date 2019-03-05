package com.gmail.chernii.oleksii.list;

import com.gmail.chernii.oleksii.list.List;

import java.util.Arrays;

/**
 * Created by Space on 05.03.2019.
 */
public class MyArrayList<E> implements List<E> {
    private E[] elements;
    private int length;
    private int size;

    public MyArrayList() {
        this.length = 10;
        this.size = 0;
        elements = (E[]) new Object[this.length];
    }

    @Override
    public void add(E item) {
        if (size < length - 1) {
            elements[size++] = item;
        } else {
            length *= 2;
            elements = Arrays.copyOf(elements, length);
            elements[size++] = item;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size - 1 || size == 0) {
            return null;
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index == size - 1) {
            elements[index] = null;
            size--;
        } else {
            elements[index] = null;
            System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = size - 1; i > -1; i--) {
            elements[i] = null;
        }
        size = 0;
    }
}
