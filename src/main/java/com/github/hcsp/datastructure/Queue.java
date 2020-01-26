package com.github.hcsp.datastructure;

public class Queue {
    private int[] elements;

    public Queue() {
        this.elements = new int[0];
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        int[] newArray = new int[elements.length + 1];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        newArray[elements.length] = value;
        elements = newArray;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int[] newArray = new int[elements.length - 1];
        int head = elements[0];
        System.arraycopy(elements, 1, newArray, 0, elements.length - 1);
        elements = newArray;
        return head;
    }
}
