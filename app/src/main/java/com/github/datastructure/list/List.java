package com.github.datastructure.list;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure
 * Version：1.0
 * time：2017/1/8 9:21
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public interface List {

    public int getSize();

    public boolean isEmpty();

    public boolean contains(Object e);

    public int indexOf(Object obj);

    public void insert(int i, Object obj);

    public boolean insertBefore(Object obj, Object e);

    public boolean insertAfter(Object obj, Object e);

    public Object remove(int i);

    public boolean remove(Object e);

    public Object replace(int i, Object e);

    public Object get(int i);
}
