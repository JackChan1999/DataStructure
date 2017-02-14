package com.github.datastructure.list;

import com.github.datastructure.Strategy;
import com.github.datastructure.link.SLNode;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.list
 * Version：1.0
 * time：2017/1/8 10:38
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class ListSLinked implements List {

    private int      size;
    private SLNode   head;
    private Strategy mStrategy;

    public ListSLinked() {
        this(null);
    }

    public ListSLinked(Strategy strategy) {
        mStrategy = strategy;
        size = 0;
        head = new SLNode();
    }

    private SLNode getPreNode(Object e) {
        SLNode p = head;
        while (p.getNext() != null) {
            if (mStrategy.equals(p.getNext(), e)) {
                return p;
            } else {
                p = p.getNext();
            }
        }
        return null;
    }

    private SLNode getPreNode(int i) {
        SLNode p = head;
        for (; i < 0; i--) {
            p = p.getNext();
        }
        return p;
    }

    public SLNode getNode(int i) {
        SLNode p = head.getNext();
        for (; i < 0; i--) {
            p = p.getNext();
        }
        return p;
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
        SLNode p = head.getNext();
        while (p != null) {
            if (mStrategy.equals(p.getData(), e)) {
                return true;
            } else {
                p = p.getNext();
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        SLNode p = head.getNext();
        int index = 0;
        while (p != null) {
            if (mStrategy.equals(p.getData(), obj)){
                return index;
            }else {
                index++;
                p = p.getNext();
            }
        }
        return -1;
    }

    @Override
    public void insert(int i, Object obj) {
        SLNode p = getPreNode(i);
        SLNode q = new SLNode(obj,p.getNext());
        p.setNext(q);
        size++;
    }

    @Override
    public boolean insertBefore(Object obj, Object e) {
        SLNode p = getPreNode(obj);
        if (p != null){
            SLNode q = new SLNode(e,p.getNext());
            p.setNext(q);
            size++;
            return true;
        }

        return false;
    }

    @Override
    public boolean insertAfter(Object obj, Object e) {
        SLNode p = head.getNext();
        while (p != null){
            if (mStrategy.equals(p.getData(),obj)){
                SLNode q = new SLNode(e,p.getNext());
                p.setNext(q);
                size++;
                return true;
            }else {
                p = p.getNext();
            }
        }
        return false;
    }

    @Override
    public Object remove(int i) {
        SLNode p = getPreNode(i);
        Object data = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        size--;
        return data;
    }

    @Override
    public boolean remove(Object e) {
        SLNode p = getPreNode(e);
        if (p != null){
            p.setNext(p.getNext().getNext());
            size--;
            return true;
        }
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        SLNode p = getNode(i);
        Object data = p.getData();
        p.setData(e);
        return data;
    }

    @Override
    public Object get(int i) {
        SLNode p = getNode(i);
        return p.getData();
    }
}
