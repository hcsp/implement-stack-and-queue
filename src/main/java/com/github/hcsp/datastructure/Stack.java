package com.github.hcsp.datastructure;

public class Stack {
    private Node top;

    // 将一个元素压入栈内
    public void push(int value) {
        Node temp = new Node();
        temp.value = value;
        temp.next = top;
        top = temp;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (top.next == null) {
            return 0;
        }
        int value = top.value;
        top = top.next;
        return value;
    }


}
class Node {
    int value;
    Node next;
}
