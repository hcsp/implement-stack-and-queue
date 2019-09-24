package com.github.hcsp.datastructure;

public class Stack {
    // Java 源码中发现 Stack 是用数组实现的
    private int count = 0;
    private int[] stackArray = new int[1];

    // 将一个元素压入栈内
    public void push(int value) {
        // 当计数 count 与 stackArray.length 相等时，即当前元素加进来就超出了数组的范围
        // 将数组长度扩充到两倍
        if (count == stackArray.length) {
            resize(2 * stackArray.length);
        }
        stackArray[count++] = value;
    }

    private void resize(int len) {
        int[] tmp = new int[len];
        for (int i = 0; i < count; i++) {
            tmp[i] = stackArray[i];
        }
        // 重新指向 stackArray
        stackArray = tmp;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        // 当前数组中共有 count 个
        count -= 1;
        return stackArray[count];
    }
}
