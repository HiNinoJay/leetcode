package com.ninojay.leetcode.f动态规划.a一维;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/21
 */
public class SevenZero70 {


    public static void main(String[] args) {
        int n = 3;
        NinoPrintUtil.printAllType(new SevenZero70().climbStairs(n));
    }

    public int climbStairs(int n) {
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
