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
 * time：2017/1/14 10:24
 * des ：${TODO}
 * gitVersion：$Rev$
 * updateAuthor：$Author$
 * updateDate：$Date$
 * updateDes：${TODO}
 * ============================================================
 **/
public class Sort {

    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = findMiddle(data, start, end);
        quickSort(data, start, mid - 1);
        quickSort(data, mid + 1, end);
    }

    public static int findMiddle(int[] data, int start, int end) {
        int temp = data[end];
        int left = start - 1;
        int right = end;

        while (true) {
            while (++left < end && data[left] <= temp) ;

            if (left == end) {
                break;
            }

            while (--right >= start && data[right] <= temp) ;

            if (left < right){
                int d = data[left];
                data[left] = data[right];
                data[right] = d;
            }else {
                int d = data[left];
                data[left] = data[end];
                data[end] = d;
                break;
            }
        }
        return left;
    }

    public static void insertSort(int datas[]) {
        int j = 0; // 第二个数据开始插入的下标
        int i = 0;// 插入的次数
        for (i = 1; i < datas.length; i++) {
            int temp = datas[i];
            for (j = i - 1; j >= 0; j--) {
                if (datas[j] > temp) {
                    datas[j + 1] = datas[j];
                } else {
                    break;
                }
            }
            // 判断 j == -1 或者 就是第一个小于等于temp数据的位置
            datas[j + 1] = temp;
        }
    }
}
