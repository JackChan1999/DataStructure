package com.github.datastructure.tree;

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
 * time：2017/1/10 0:43
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class BinaryTree {

    private Node root;

    public class Node{
        Node parent;
        Node left;
        Node right;
        Object data;

        public Node(Object data) {
            this.data = data;
        }
    }


    public Node findParent(Object data, Node currentNode){
        Node temp = currentNode;
        Node parent = currentNode;

        while (temp != null){
            parent = temp;
            if (temp.data.hashCode() == data.hashCode()){
                break;
            }
            if (compare(data,temp.data)){
                temp = temp.right;
            }else {
                temp = temp.left;
            }
        }
        return parent;
    }

    public boolean compare(Object data1, Object data2){
        boolean res = false;
        if (data1 instanceof Comparable){
            Comparable c1 = (Comparable) data1;
            Comparable c2 = (Comparable) data2;
            res = c1.compareTo(c2) > 0;
        }else {
            res = data1.toString().equals(data2.toString());
        }
        return res;
    }

    public void print(){
        print(root);
    }

    public void print(Node node){
        print(node.left);
        System.out.println(node.data + ",");
        print(node.right);
    }

}
