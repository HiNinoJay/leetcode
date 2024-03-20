package com.ninojay.leetcode.i位运算10.a常用技巧;

/**
 * @author : zengzhongjie
 * @date : 2023/10/15 12:30
 */
public class Solution {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        // 异或
        System.out.println("1和0的异或结果：" + (a^b));


        int n = Integer.parseInt("11110100", 2);
        System.out.println("原来的n：" + Integer.toBinaryString(n));

        // 去除最低的那一位
        n = n & (n-1);
        System.out.println("去除最低位后：" + Integer.toBinaryString(n));

        n = Integer.parseInt("11110100", 2);
        System.out.println("原来的n：" + Integer.toBinaryString(n));

        // 获取最后一位1
        n = n & (-n);
        System.out.println("获取最后的一位1：" + Integer.toBinaryString(n));

    }
}
