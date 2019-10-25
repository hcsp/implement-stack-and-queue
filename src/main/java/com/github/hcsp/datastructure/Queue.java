package com.github.hcsp.datastructure;

import java.util.NoSuchElementException;

public class Queue {
    ListNode dummmyHead;
    ListNode tail;
    int size;
    // 将一个元素添加到队列尾部

    private class ListNode {
        ListNode next;
        int value;

        ListNode(ListNode next, int value) {
            this.next = next;
            this.value = value;
        }

        ListNode() {
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("队列为空");
        }
        return dummmyHead.next.value;
    }

    public Queue() {
        this.dummmyHead = new ListNode();
        this.tail = new ListNode();
    }

    public void add(int value) {
        if (dummmyHead.next == null) {
            ListNode node = new ListNode(null, value);
            dummmyHead.next = node;
            tail = node;
            size++;
        } else {
            ListNode node = new ListNode(null, value);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("队列为空");
        }
        ListNode rm = dummmyHead.next;
        dummmyHead.next = dummmyHead.next.next;
        size--;
        return rm.value;
    }
}

