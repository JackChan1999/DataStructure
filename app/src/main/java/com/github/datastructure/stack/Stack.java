package com.github.datastructure.stack;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.stack
 * Version：1.0
 * time：2017/1/9 14:51
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public interface Stack {
    public int getSize();

    public boolean isEmpty();

    public void push(Object e);

    public Object pop();

    public Object peek();
}
