package com.ninojay.leetcode190.f动态规划28.c分割3;

/**
 * @author zengzhongjie
 * @date 2023/2/22
 */
public class TwoSevenNine279 {
    public static void main(String[] args) {
        System.out.println(new TwoSevenNine279().numSquares(13));
    }

    public int numSquares(int n) {
        // 这里的动态规划思想是这样的：
        // 动态规划数组 dp[2] 代表 2的最少数
        // 那么 n 的 话，就需要去减去 一个平方数
        // 也就是 dp[n- 1*1] , 减去的时候也就意味着 分配了 一个完全平方数
        // 所以要 加1 ，这个时候再看 dp[n-1*1] + 1 的完全平方总数 与 dp[n]的比较
        // 再尝试 去看分配一个 4 是什么样子 dp【n-2*2] + 1
        // 所以说内层循环 就是 尝试分配一个 完全平方数 找寻 最小的可能性
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j*j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
        }
        return dp[n];
    }

}
