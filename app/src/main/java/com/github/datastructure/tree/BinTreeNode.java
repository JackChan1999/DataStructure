package com.github.datastructure.tree;

import com.github.datastructure.link.Node;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.tree
 * Version：1.0
 * time：2017/1/9 23:24
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class BinTreeNode implements Node{

    private Object data;
    private BinTreeNode parent;
    private BinTreeNode lchild;
    private BinTreeNode rchild;
    private int size;
    private int height;

    public BinTreeNode() {
        this(null);
    }

    public BinTreeNode(Object e) {
        data = e;
        height = 0;
        size = 1;
        parent = lchild = rchild = null;
    }

    @Override
    public Object getData() {
        return data;
    }

    @Override
    public void setData(Object data) {
        this.data = data;
    }

    public boolean hasParent(){
        return parent != null;
    }

    public boolean hasLChild(){
        return lchild != null;
    }

    public boolean hasRChild(){
        return rchild != null;
    }

    public boolean isleaf(){
        return !hasLChild() && !hasRChild();
    }

    public boolean isLChild(){
        return hasParent() && (parent.lchild == this);
    }
    public boolean isRChild(){
        return hasParent() && (parent.rchild == this);
    }

    public int getHeight(){
        return height;
    }

}
