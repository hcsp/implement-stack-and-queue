package com.github.hcsp.datastructure;

public class Stack {
    private Integer[] values = new Integer[32];
    private int cursor = -1;
    private void ensureCapacity(){
        if (cursor+1>=values.length){
            Integer[] newValues = new Integer[values.length*2];
            System.arraycopy(newValues, 0, values, 0, values.length);
            this.values = newValues;
        }
    }
    // 将一个元素压入栈内
    public void push(int value) {
        ensureCapacity();
        cursor++;
        this.values[cursor] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int value = this.values[cursor];
        this.values[cursor] = null;
        cursor--;
        return value;
    }
}
