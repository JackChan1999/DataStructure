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
 * time：2017/1/9 15:23
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public interface Queue {

    public int getSize();

    public boolean isEmpty();

    public void enqueue(Object e);

    public Object dequeue();

    public Object peek();
}
