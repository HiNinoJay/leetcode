package com.ninojay.leetcode.f动态规划.f字符串编辑;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:03
 */
public class SixFiveZero650 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new SixFiveZero650().minSteps(3));
    }

    public int minSteps(int n) {

        int[] dp = new int[n+1];

        for(int i = 2; i <= n; i++) {
            // 也就是说i 为 0,1 都不需要任何操作步骤，直接返回
            // 其他的 最多只需要复制1次，粘贴i-1次，加起来就是 i次
            dp[i] = i;
            for(int j = 2; j*j <= i; j++) {
                if(i%j == 0) {
                    // 一旦往前能找到，自然可以利用更短的，且立马返回，因为一定是最短的
                    dp[i] = dp[j] + dp[i/j];
                    break;
                }
            }
        }


        return dp[n];
    }
}
