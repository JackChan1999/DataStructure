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
 * time：2017/1/8 10:33
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class DLNode implements Node {
    private Object element;
    private DLNode next;
    private DLNode pre;

    public DLNode() {
        this(null, null, null);
    }

    public DLNode(Object element, DLNode next, DLNode pre) {
        this.element = element;
        this.next = next;
        this.pre = pre;
    }

    public DLNode getPre() {
        return pre;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public void setPre(DLNode pre) {
        this.pre = pre;
    }

    @Override
    public Object getData() {
        return element;
    }

    @Override
    public void setData(Object data) {
        element = data;
    }
}
