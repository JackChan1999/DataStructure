package com.github.datastructure.stack;

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
 * time：2017/1/9 14:54
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class StackArray implements Stack {

    private int top;
    private final int len = 8;
    private Object[] elements;

    public StackArray() {
        top = -1;
        elements = new Object[len];
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public void push(Object e) {
        if (getSize() >= elements.length){
            expandSpace();
        }
        elements[++top] = e;
    }

    @Override
    public Object pop() {
        if (getSize() < 1){
            throw new RuntimeException("stack is null");
        }
        Object obj = elements[top];
        elements[top--] = null;
        return obj;
    }

    @Override
    public Object peek() {
        if (getSize() < 1){
            throw new RuntimeException("stack is null");
        }
        return elements[top];
    }

    private void expandSpace(){
        Object[] array = new Object[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }
        elements = array;
    }
}
