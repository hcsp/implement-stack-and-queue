package com.github.hcsp.datastructure;

public class Queue {
    LiQueue front = null;
    LiQueue rear = null;

    public boolean isQueueEmpty() {
        if (this.front == null || this.rear == null) {
            return true;
        } else {
            return false;
        }
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        LiQueue temp = new LiQueue();
        temp.value = value;
        temp.next = null;
        if (isQueueEmpty()) {
            rear = front = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }

    }

    // 将一个元素从队列头部移走
    public int remove() {
        LiQueue temp = new LiQueue();
        if (isQueueEmpty()) {
            return 0;
        } else {
            temp = front;
        }
        if (rear == front) {
            rear = front = null;
        } else {
            front = front.next;
        }
        return temp.value;
    }
}

class LiQueue {
    int value;
    LiQueue next;
}
