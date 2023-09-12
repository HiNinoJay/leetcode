package com.ninojay.leetcode190.f动态规划28;

/**
 * @author zengzhongjie
 * @date 2023/2/21
 */
public class SevenZero70 {


    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int pre1 = 1;
        int pre2 = 2;
        int cur = n;
        for(int i = 3; i <= n; i++) {
           cur = pre1 + pre2;
           pre1 = pre2;
           pre2 = cur;
        }
        return cur;
    }
}
