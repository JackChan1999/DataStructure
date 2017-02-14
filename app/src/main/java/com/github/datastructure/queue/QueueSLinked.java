package com.github.datastructure.queue;

import com.github.datastructure.link.SLNode;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.queue
 * Version：1.0
 * time：2017/1/9 22:52
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class QueueSLinked implements Queue {
    private SLNode front;
    private SLNode rear;
    private int size;

    public QueueSLinked() {
        size = 0;
        front = new SLNode();
        rear = front;
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
    public void enqueue(Object e) {
        SLNode node = new SLNode(e,null);
        rear.setNext(node);
        rear = node;
        size++;
    }

    @Override
    public Object dequeue() {
        if (size < 1){
            throw new RuntimeException("queue is null");
        }
        SLNode p = front.getNext();
        front.setNext(p.getNext());
        size--;
        if (size < 1) rear = front;
        return p.getData();
    }

    @Override
    public Object peek() {
        if (getSize() < 1){
            throw new RuntimeException("queue is null");
        }
        return front.getNext().getData();
    }
}
