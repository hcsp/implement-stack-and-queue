package com.github.hcsp.datastructure;


public class Queue {
    private Node head;
    private Node tail;

    class Node {
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        Node node = new Node(value);
        if (head == null && tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    // 将一个元素从队列头部移走
    public int remove() {
        int temp = 0;
        if (head != null) {
            temp = head.value;
            head = head.next;
        }
        return temp;
    }
}
