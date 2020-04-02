package com.github.hcsp.datastructure;

import java.util.LinkedList;
import java.util.Queue;

//不使用数组模拟栈，这里使用两个队列来模拟一个栈的插入和删除
public class Stack {
    Queue<Integer> queue = new LinkedList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        queue.offer(value);
        int size = queue.size();
        while (size-- > 1) {
            queue.add(queue.poll());
        }

    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            throw new NullPointerException();
        }
    }
}
