package com.github.datastructure.list;

import com.github.datastructure.Strategy;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure
 * Version：1.0
 * time：2017/1/8 9:44
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class ListArray implements List {

    private final int len = 8;
    private Strategy mStrategy;
    private int      size;
    private Object[] elements;

    public ListArray() {
    }

    public ListArray(Strategy strategy) {
        mStrategy = strategy;
        size = 0;
        elements = new Object[len];
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
    public boolean contains(Object e) {
        for (int i = 0; i < size; i++) {
            if (mStrategy.equals(e,elements[i])) return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (mStrategy.equals(obj,elements[i])) return i;
        }
        return -1;
    }

    @Override
    public void insert(int i, Object obj) {
        if (i < 0 || i > size){
            throw new RuntimeException("下标越界");
        }

        if (size >= elements.length){
            expandSpace();
        }

        for (int j = size; j < i; j--) {
            elements[j] = elements[j-1];
        }

        elements[i] = obj;
        size++;
    }

    public void expandSpace(){
        Object[] array = new Object[elements.length*2];
        for (int i=0; i<elements.length; i++){
            array[i] = elements[i];
        }
        elements = array;
        //System.arraycopy();
    }

    @Override
    public boolean insertBefore(Object obj, Object e) {
        int index = indexOf(obj);
        if (index < 0) return false;

        insert(index,e);

        return true;
    }

    @Override
    public boolean insertAfter(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0) return false;
            insert(i+1,e);
        return true;
    }

    @Override
    public Object remove(int i) {
        if (i < 0 || i > size){
            throw new RuntimeException("index outOfBoundary");
        }

        Object obj = elements[i];

        for (int j = i; j < size-1; j++) {
            elements[j] = elements[j+1];
        }

        elements[--size] = null;

        return obj;
    }

    @Override
    public boolean remove(Object e) {
        int i = indexOf(e);

        if (i < 0) return false;

        remove(i);

        return true;
    }

    @Override
    public Object replace(int i, Object e) {
        if (i < 0 || i >size){
            throw new RuntimeException("index out of boundary");
        }

        Object obj = elements[i];
        elements[i] = e;

        return obj;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i > size){
            throw new RuntimeException("index out of boundary");
        }

        return elements[i];
    }
}
