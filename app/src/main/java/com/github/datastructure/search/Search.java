package com.github.datastructure.search;

/**
 * ============================================================
 * Copyright：JackChan和他的朋友们有限公司版权所有 (c) 2017
 * Author：   JackChan
 * Email：    815712739@qq.com
 * GitHub：   https://github.com/JackChan1999
 * GitBook：  https://www.gitbook.com/@alleniverson
 * CSDN博客： http://blog.csdn.net/axi295309066
 * 个人博客： https://jackchan1999.github.io/
 * 微博：     AndroidDeveloper
 * <p>
 * Project_Name：DataStructure
 * Package_Name：com.github.datastructure.search
 * Version：1.0
 * time：2017/5/13 0:47
 * des ：${TODO}
 * gitVersion：2.12.0.windows.1
 * updateAuthor：AllenIverson
 * updateDate：2017/5/13 0:47
 * updateDes：${TODO}
 * ============================================================
 */
public class Search {

    /*
	 * 两个明确：
	 * 返回值类型：int
	 * 参数列表：int[] arr,int value
	 */
    public static int binarySearch(int[] arr,int value){
        //定义最大索引，最小索引
        int max = arr.length -1;
        int min = 0;

        //计算出中间索引
        int mid = (max +min)/2;

        //拿中间索引的值和要查找的值进行比较
        while(arr[mid] != value){
            if(arr[mid]>value){
                max = mid - 1;
            }else if(arr[mid]<value){
                min = mid + 1;
            }

            //加入判断
            if(min > max){
                return -1;
            }

            mid = (max +min)/2;
        }

        return mid;
    }
}
