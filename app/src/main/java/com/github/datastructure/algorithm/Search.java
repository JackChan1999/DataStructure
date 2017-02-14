package com.github.datastructure.algorithm;

/**
 * ============================================================
 * Copyright：${TODO}有限公司版权所有 (c) 2017
 * Author：   陈冠杰
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChen1999
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.algorithm
 * Version：1.0
 * time：2017/1/14 14:01
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class Search {

    public static int binarySearch(int[] a, int key){
        return binarySearch(a,0,a.length,key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key){
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high){
            int mid = (low + high) >>> 1;
            int miValue = a[mid];

            if (miValue < key){
                low = mid +1;
            }else if (miValue > key){
                high = mid - 1;
            }else {
                return mid;
            }
        }

        return -(low + 1);
    }
}
