package com.github.hcsp.datastructure;

public class Queue {
    private int[] elements;
    private int first;
    private int last;

    public Queue() {
        this.elements = new int[8];
        this.first = 1;
        this.last = 1;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        elements[last] = value;
        last = (last + elements.length - 1) % elements.length;
        if (last == first) {
            resize(elements);
        }
    }

    private void resize(int[] elements) {
        int[] newArray = new int[elements.length * 2];
        int newLast = last;
        for (int i = 0; i < elements.length; i++) {
            newArray[newLast] = elements[last];
            last = (last + elements.length - 1) % elements.length;
            newLast = (newLast + newArray.length - 1) % newArray.length;
        }
        this.last = newLast;
        this.elements = newArray;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (elements.length == 0) {
            System.out.println("There is not element in the Queue.");
        }
        int head = elements[first];
        first = (first + elements.length - 1) % elements.length;
        return head;
    }
}
