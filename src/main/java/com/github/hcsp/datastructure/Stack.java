package com.github.hcsp.datastructure;
import java.util.NoSuchElementException;
public class Stack {
    int[] arr;
    int size;

    public Stack() {
        size = 0;
        arr = new int[20];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("栈为空");
        }
        return arr[size - 1];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        if (arr.length == size) {
            resize(arr.length + arr.length >> 1);
        }
        arr[size++] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("栈为空");
        }
        int res = arr[size - 1];
        arr[--size] = 0;
        if (size == arr.length >> 4 && arr.length >> 1 != 0) {
            resize(arr.length >> 1);
        }
        return res;
    }

    private void resize(int newCapacity) {
        int[] newArr = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
