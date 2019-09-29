package com.github.hcsp.datastructure;

public class Stack {
    private Node head = null;

    static class Node {
        int value;
        Node next;
    }

    boolean isEmpty() {
        return head == null;
    }

    // 将一个元素压入栈内
    public void push(int value) {
        Node newHead = new Node();
        newHead.value = value;
        newHead.next = head;
        head = newHead;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int popValue = head.value;
        if (!isEmpty()) {
            head = head.next;
        } else {
            head = null;
        }
        return popValue;
    }
}
