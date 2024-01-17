package com.ninojay.leetcode190.f动态规划28.e背包问题3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:02
 */
public class ThreeTwoTwo322 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new ThreeTwoTwo322().coinChange(NinoCreationUtil.createOneDimensionArray(1, 2, 5), 11));
    }

    public int coinChange(int[] coins, int amount) {
        // 入参判断
        if(coins == null || coins.length < 1) {
            return -1;
        }
        // dp[amount]代表的含义是 当前金额amount 最少的硬币数目
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++) {
            // i 作为 金额来进行遍历
            for(int coin : coins) {
                if(i >= coin) {
                    // 当 i 这个金额比 硬币的数额更大时，当然可以进行拼凑
                    // 但是因为我们要找的是最小的数额，所以去找小的
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }

        // 没有发生变化，自然是无法构造
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
