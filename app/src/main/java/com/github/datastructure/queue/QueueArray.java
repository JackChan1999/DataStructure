package com.github.datastructure.queue;

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
 * time：2017/1/9 20:44
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class QueueArray implements  Queue{
    private int capacity;
    private int front;
    private int rear;
    private static final int cap = 7;
    private Object[] elements;

    public QueueArray() {
        this(cap);
    }

    public QueueArray(int cap) {
        capacity = cap + 1;
        front = rear = 0;
        elements = new Object[capacity];
    }

    @Override
    public int getSize() {
        return (rear - front + capacity)%capacity;
    }

    @Override
    public boolean isEmpty() {
        return rear == front;
    }

    @Override
    public void enqueue(Object e) {
        if (getSize() == capacity - 1){
            expandSpace();
        }
        elements[rear] = e;
        rear = (rear +1)%capacity;
    }

    public void expandSpace(){
        Object[] array = new Object[elements.length*2];
        int i=front, j=0;
        while (i != rear){
            array[j++] = elements[i];
            i = (i + 1)%capacity;
        }
        elements = array;
        capacity = elements.length;
        front = 0;
        rear = j;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()){
            throw new RuntimeException("queue is null");
        }
        Object obj = elements[front];
        elements[front] = null;
        front = (front + 1)%capacity;
        return obj;
    }

    @Override
    public Object peek() {
        if (isEmpty()){
            throw new RuntimeException("queue is null");
        }
        return elements[front];
    }
}
