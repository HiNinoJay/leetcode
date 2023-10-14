package com.ninojay.leetcode190.util;

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
                List list2 = (List) o1;
                if(CollectionUtils.isEmpty(list2)) {
                    System.out.println("内层集合为空 ");
                    return;
                }
                Object o2 = list2.get(0);
                if(o2 instanceof Integer) {
                    NinoPrintUtil.printListListInteger((List<List<Integer>>) object);
                }
            } else {

            }
        } else {
            System.out.println(object);
        }
    }


    /**
     * 打印一位数组
     * @param data
     */
    public static void printOneDimensionArray(int[] data) {

        System.out.print("该一维数组：");
        Arrays.stream(data).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    /**
     * 打印二维数组
     * @param data
     */
    public static void printTwoDimensionArray(int[][] data) {

        System.out.println("该二维数组：");
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTwoDimensionCharArray(char[][] data) {
        System.out.println("该二维数组：");
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void printListListInteger(List<List<Integer>> lists) {
        if(lists == null) {
            System.out.println("无数据可打印");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(List<Integer> list : lists) {
            sb.append("[");
            for(Integer i : list) {
                sb.append(i + ",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("],");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb);
    }
}
