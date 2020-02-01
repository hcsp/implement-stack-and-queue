package com.github.hcsp.datastructure;

public class Queue {
    private static class Node{
        public Node next;
        public Integer value;
        Node(Integer value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    // 将一个元素添加到队列尾部
    public void add(int value) {
        Node nextNode = new Node(value);
        if (head == null){
            tail = nextNode;
            head = nextNode;
        }else {
            tail.next = nextNode;
            tail = nextNode;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (head == null){
            throw new NullPointerException();
        }

        int value = head.value;
        if (head.next == null){
            head = tail = null;
        }else {
            if (head==tail){
                tail = head.next;
            }
            head = head.next;

        }

        return value;
    }
}
