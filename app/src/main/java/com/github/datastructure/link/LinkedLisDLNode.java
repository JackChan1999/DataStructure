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
 * time：2017/1/9 11:06
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class LinkedLisDLNode implements LinkedList {

    private int    size;
    private DLNode head;
    private DLNode tail;

    public LinkedLisDLNode() {
        size = 0;
        head = new DLNode();
        tail = new DLNode();
        head.setNext(tail);
        tail.setPre(head);
    }

    public DLNode checkPosition(Node p){
        if (p == null){
            throw new RuntimeException("node is null");
        }
        if (p == head){
            throw new RuntimeException("node point to head");
        }

        if (p == tail){
            throw new RuntimeException("node point to tail");
        }

        DLNode node = (DLNode) p;
        return node;
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
    public Node first() {
        if (isEmpty()){
            throw new RuntimeException("link is empty");
        }
        return head.getNext();
    }

    @Override
    public Node last() {
        if (isEmpty()){
            throw new RuntimeException("link is empty");
        }
        return tail.getPre();
    }

    @Override
    public Node getNext(Node p) {
        DLNode node = checkPosition(p);
        node = node.getNext();
        if (node == tail){
            throw new RuntimeException("node is tail");
        }
        return node;
    }

    @Override
    public Node getPre(Node p) {
        DLNode node = checkPosition(p);
        node = node.getPre();
        if (node == head){
            throw new RuntimeException("node is head");
        }
        return node;
    }

    @Override
    public Node insertFirst(Object e) {
        DLNode node = new DLNode(e,head.getNext(),head);
        head.setNext(node);
        head.getNext().setPre(node);
        size++;
        return node;
    }

    @Override
    public Node insertLast(Object e) {
        DLNode node = new DLNode(e,tail,tail.getPre());
        tail.getPre().setNext(node);
        tail.setPre(node);
        size++;
        return node;
    }

    @Override
    public Node insertAfter(Node p, Object e) {

        DLNode node = checkPosition(p);
        DLNode newnode = new DLNode(e,node.getNext(),node);
        node.setNext(newnode);
        node.getNext().setPre(newnode);
        size++;
        return newnode;
    }

    @Override
    public Node insertBefore(Node p, Object e) {
        DLNode node = checkPosition(p);
        DLNode newnode = new DLNode(e,node.getNext(),node);
        node.setNext(newnode);
        node.getNext().setPre(newnode);
        size++;
        return newnode;
    }

    @Override
    public Object remove(Node p) {
        DLNode node = checkPosition(p);
        Object data = node.getData();
        node.getPre().setNext(node.getNext());
        node.getNext().setPre(node.getPre());
        size--;
        return data;
    }

    @Override
    public Object removeFirst() {
        return remove(head.getNext());
    }

    @Override
    public Object removeLast() {
        return remove(tail.getPre());
    }

    @Override
    public Object replace(Node p, Object e) {
        DLNode node = checkPosition(p);
        Object data = node.getData();
        node.setData(e);
        return data;
    }

    @Override
    public Iterator elements() {
        return new LinkedListIterator(this);
    }
}
