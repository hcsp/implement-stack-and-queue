package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Queue {
    int[] elements;
    int size;
    int head = 0;
    int tail = 0;

    public Queue() {
        size = 8;
        elements = new int[size];
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (tail == size) {
            if (head == 0) {
                size = size << 1;
                int[] tmp = elements;
                elements = Arrays.copyOf(tmp, size);
            } else {
                for (int i = head; i < tail; ++i) {
                    elements[i - head] = elements[i];
                } // 搬移完之后重新更新head和tail
                tail -= head;
                head = 0;
            }
        }

        elements[tail] = value;
        tail++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (head == tail) {
            throw new RuntimeException("当前队列为空，无元素弹出");
        }
        int result = elements[head];
        head++;
        return result;
    }
}
