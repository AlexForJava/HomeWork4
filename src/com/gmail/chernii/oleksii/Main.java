package com.gmail.chernii.oleksii;

import com.gmail.chernii.oleksii.list.List;
import com.gmail.chernii.oleksii.list.MyArrayList;
import com.gmail.chernii.oleksii.list.MyLinkedList;
import com.gmail.chernii.oleksii.stack.MyStack;
import com.gmail.chernii.oleksii.stack.Stack;

/**
 * Created by Space on 05.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        //testLinkedList();
        //testArrayList();
        testStack();
    }

    static void testLinkedList() {
        List<Integer> list = new MyLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        list.clear();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    static void testArrayList() {
        List<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    static void testStack() {
        Stack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.remove(3);
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
