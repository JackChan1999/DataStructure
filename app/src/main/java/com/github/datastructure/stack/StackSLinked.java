package com.github.datastructure.stack;

import com.github.datastructure.link.SLNode;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.stack
 * Version：1.0
 * time：2017/1/9 15:12
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class StackSLinked implements Stack {
    private int size;
    private SLNode top;

    public StackSLinked() {
        size = 0;
        top = null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(Object e) {
        SLNode node = new SLNode(e,top);
        top = node;
        size++;
    }

    @Override
    public Object pop() {
        if (size < 1) throw new RuntimeException("stack is null");
        Object data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    @Override
    public Object peek() {
        if (size < 1) throw new RuntimeException("stack is null");
        return top.getData();
    }
}
