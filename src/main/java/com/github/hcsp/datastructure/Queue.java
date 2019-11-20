package com.github.hcsp.datastructure;

public class Queue {

    private int start;

    private int end;

    private int max_size = 16;

    private Object[] data;

    public Queue() {
        start = end = 0;
        data = new Object[max_size];
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (end == max_size) {
            throw new RuntimeException("队列满了");
        } else {
            data[end++] = value;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (start == end) {
            throw new RuntimeException("队列为空");
        } else {
            int num = (int) data[start];
            data[start++] = null;
            return num;
        }
    }
}
