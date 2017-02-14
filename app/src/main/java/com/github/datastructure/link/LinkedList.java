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
 * time：2017/1/9 10:56
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public interface LinkedList {

    public  int getSize();

    public boolean isEmpty();

    public Node first();

    public Node last();

    public Node getNext(Node p);

    public  Node getPre(Node p);

    public Node insertFirst(Object e);

    public Node insertLast(Object e);

    public Node insertAfter(Node p, Object e);

    public Node insertBefore(Node p, Object e);

    public Object remove(Node p);

    public Object removeFirst();

    public Object removeLast();

    public Object replace(Node p, Object e);

    public Iterator elements();
}
