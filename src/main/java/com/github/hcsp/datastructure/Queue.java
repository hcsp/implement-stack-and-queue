package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> container = new ArrayList<>();

    private List<Integer> getContainer() {
        return container;
    }

    private void setContainer(List<Integer> container) {
        this.container = container;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        List<Integer> container = getContainer();
        container.add(value);
        setContainer(container);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        List<Integer> container = getContainer();
        int value = container.size() > 0 ? container.remove(0) : -1;
        setContainer(container);
        return value;
    }
}
