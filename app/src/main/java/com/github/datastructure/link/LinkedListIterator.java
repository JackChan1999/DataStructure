package com.github.datastructure.link;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.link
 * Version：1.0
 * time：2017/1/9 11:44
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class LinkedListIterator implements Iterator {
    private LinkedList list;
    private Node       current;

    public LinkedListIterator(LinkedList list) {
        this.list = list;
        if (list.isEmpty()){
            current = null;
        }else {
            current = list.first();
        }
    }

    @Override
    public void first() {
        if (list.isEmpty()){
            current = null;
        }else {
            current = list.first();
        }
    }

    @Override
    public void next() {
        if (isDone()){
            throw new RuntimeException(" there is none element");
        }
        if (current == list.last()){
            current = null;
        }else {
            current = list.getNext(current);
        }
    }

    @Override
    public boolean isDone() {
        return current == null;
    }

    @Override
    public Object currentItem() {
        if (isDone()){
            throw new RuntimeException(" there is none element");
        }
        return current.getData();
    }
}
