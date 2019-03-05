package com.gmail.chernii.oleksii.list;


/**
 * Created by Space on 05.03.2019.
 */
public class MyLinkedList<E> implements List<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
    }

    private boolean checkIndex(int index) {
        return index < 0 || index > size - 1;
    }

    @Override
    public void add(E item) {
        Node<E> tempLast = last;
        Node<E> newNode = new Node<E>(tempLast, item, null);
        last = newNode;
        if (tempLast == null) {
            first = newNode;
        } else {
            tempLast.next = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        return (!checkIndex(index)) ? node(index).item : null;
    }

    @Override
    public void clear() {
        for (Node<E> temp = first; temp != null; ) {
            Node<E> next = temp.next;
            temp.item = null;
            temp.next = null;
            temp.prev = null;
            temp = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public void remove(int index) {
        if (checkIndex(index)) {
            return;
        }
        Node<E> node = node(index);
        Node<E> next = node.next;
        Node<E> prev = node.prev;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.item = null;
        size--;
    }

    private Node<E> node(int index) {
        if (index < (size / 2)) {
            Node<E> temp = this.first;
            for (int i = 0; i < index; i++)
                temp = temp.next;
            return temp;
        } else {
            Node<E> temp = last;
            for (int i = size - 1; i > index; i--)
                temp = temp.prev;
            return temp;
        }
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
