package com.github.hcsp.datastructure;

public class Stack {
    Array intArray;

    public Stack() {
        intArray = new Array();
    }

    // 将一个元素压入栈内
    public void push(int value) {
        intArray.addLast(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return intArray.removeLast();
    }

    private static class Array {
        private int[] data;
        private int size;

        private Array(int capacity) {
            data = new int[capacity];
            size = 0;
        }

        private Array() {
            this(10);
        }

        void addLast(int newValue) {
            add(size, newValue);
        }

        private void add(int index, int newValue) {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("Add failed. Index out of boundary.");
            }
            if (size == data.length) {
                resize(data.length + (data.length >> 1));
            }
            for (int i = size; i >= index+1; i--) {
                data[i] = data[i-1];
            }
            data[index] = newValue;
            size++;
        }

        private void resize(int newCapacity) {
            int[] newData = new int[newCapacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }

        int removeLast() {
            return remove(size-1);
        }

        int removeFirst() {
            return remove(0);
        }

        private int remove(int index) {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("Add failed. Index out of boundary.");
            }
            int valueRemoved = data[index];
            for (int i = index+1; i < size; i++) {
                data[i-1] = data[i];
            }
            size--;
            data[size] = 0;

            if (size == data.length >> 4 && (data.length >> 1) != 0) {
                resize(data.length >> 1);
            }
            return valueRemoved;
        }
    }
}


