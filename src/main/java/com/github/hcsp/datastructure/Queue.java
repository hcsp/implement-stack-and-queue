package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

    Deque<Integer> stackOne;
    Deque<Integer> stackTwo;

    public Queue() {
        stackOne = new ArrayDeque<>();
        stackTwo = new ArrayDeque<>();
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        stackOne.push(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.pop();
    }
}
