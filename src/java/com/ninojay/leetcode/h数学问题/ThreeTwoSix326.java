package com.ninojay.leetcode.h数学问题;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class ThreeTwoSix326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));

    }

    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
