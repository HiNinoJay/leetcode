package com.ninojay.leetcode.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author : zengzhongjie
 * @date : 2023/10/14 21:49
 */
public class NinoPrintUtil<T> {

    public static void printAllType(Object object) {
        if(ObjectUtils.isEmpty(object)) {
            System.out.println("空");
            return;
        }
        if(object instanceof int[]) {
            NinoPrintUtil.printOneDimensionArray((int[])object);
        } else if(object instanceof int[][]) {
            NinoPrintUtil.printTwoDimensionArray((int[][])object);
        } else if(object instanceof char[][]) {
            NinoPrintUtil.printTwoDimensionCharArray((char[][])object);
        } else if(object instanceof List) {
            List list1 = (List) object;
            if(CollectionUtils.isEmpty(list1)) {
                System.out.println("空外层集合");
            }
            Object o1 = list1.get(0);
            if(o1 instanceof List) {
                // 二维列表
                List list2 = (List) o1;
                if(CollectionUtils.isEmpty(list2)) {
                    System.out.println("内层集合为空 ");
                    return;
                }
                NinoPrintUtil.printTwoDimensionList((List<List>) object);
            } else {
				// 一维列表
                NinoPrintUtil.printOneDimensionList(list1);
            }
        } else {
            System.out.println(object);
        }
    }


    /**
     * 打印一位数组
     * @param data
     */
    private static void printOneDimensionArray(int[] data) {

        System.out.print("该一维数组：");
        Arrays.stream(data).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    /**
     * 打印二维数组
     * @param data
     */
    private static void printTwoDimensionArray(int[][] data) {

        System.out.println("该二维数组：");
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printTwoDimensionCharArray(char[][] data) {
        System.out.println("该二维数组：");
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void printTwoDimensionList(List<List> lists) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        lists.forEach(list -> {
            sb.append("[");
            list.forEach(temp -> {
                sb.append(temp + ",");
            });
            sb.deleteCharAt(sb.length() - 1);
            sb.append("],");
        });
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb);
    }

    private static void printOneDimensionList(List list) {
        System.out.println("该列表数据如下：");
        list.forEach(temp -> {
            System.out.print(temp + " ");
        });
    }
}
