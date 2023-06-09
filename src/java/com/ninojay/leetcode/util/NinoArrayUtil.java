package com.ninojay.leetcode.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class NinoArrayUtil {

    public static int[] createOneDimensionArray(Integer... nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        return result;
    }

    /**
     * 打印一位数组
     * @param data
     */
    public static void printOneDimensionArray(int[] data) {
        System.out.print("该一维数组：");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
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

    public static int[][] createTwoDimensionArray(String s) {

        if(StringUtils.isBlank(s)) {
            return null;
        }
        s = s.replaceAll(" ", "");
        // 因为多了一个最外围的 '['
        int rowCounts = -1;
        // 这里计算列的方法是算','的数量（最后一行少了一个','，所以初值为1），','总数处以行数，即为列数
        int columnCounts = 1;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[') {
                rowCounts++;
            }
            if(s.charAt(i) == ',') {
                columnCounts++;
            }
            if(s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != ',') {

                nums.add((int)s.charAt(i) - '0');
            }
        }
        columnCounts = columnCounts / rowCounts;
        int[][] result = new int[rowCounts][columnCounts];
        int index = 0;
        for(int i = 0; i < rowCounts ; i++) {
            for(int j = 0; j < columnCounts ; j++) {
                result[i][j] = nums.get(index++);
            }
        }
        return result;
    }

    public static char[][] createTwoDimensionCharArray(String s) {
        if(StringUtils.isBlank(s)) {
            return null;
        }
        s = s.replaceAll(" ", "");
        // 因为多了一个最外围的 '['
        int rowCounts = -1;
        // 这里计算列的方法是算','的数量（最后一行少了一个','，所以初值为1），','总数处以行数，即为列数
        int columnCounts = 1;
        ArrayList<Character> words = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[') {
                rowCounts++;
            }
            if(s.charAt(i) == ',') {
                columnCounts++;
            }
            if(s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != ',' && s.charAt(i) != '"') {
                words.add(s.charAt(i));
            }
        }
        columnCounts = columnCounts / rowCounts;
        char[][] result = new char[rowCounts][columnCounts];
        int index = 0;
        for(int i = 0; i < rowCounts ; i++) {
            for(int j = 0; j < columnCounts ; j++) {
                result[i][j] = words.get(index++);
            }
        }
        return result;
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
}
