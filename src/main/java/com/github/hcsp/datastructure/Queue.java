package com.github.hcsp.datastructure;

import java.util.Stack;

//不使用数组模拟队列，这里使用两个栈来模拟一个队列的插入和删除
public class Queue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        stack1.push(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {

        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
}
