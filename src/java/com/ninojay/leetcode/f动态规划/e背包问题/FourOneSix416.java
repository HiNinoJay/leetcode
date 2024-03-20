package com.ninojay.leetcode.f动态规划.e背包问题;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:01
 */
public class FourOneSix416 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new FourOneSix416().canPartition(NinoCreationUtil.createOneDimensionArray(1, 5, 11, 5)));
    }

    public boolean canPartition(int[] nums) {
        // 先根据题意进行处理
        // 拿到总和，并且总和为偶数，才能符合题意
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 != 0) {
            return false;
        }
        // 要去构造dp，那么只需要找到一半的数
        int target = sum / 2;
        // dp[2][14]代表的含义是 第2个数，放了过后，还剩多少target
        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        dp[0][0] = true;
        for(int i = 1; i <= nums.length; i++) {
            for(int j = 0; j <= target; j++) {
                // j 代表的是剩余的target
                if(j < nums[i-1]) {
                    // 剩余的target比数小，说明放不下了,放不下就直接拿之前的值
                    dp[i][j] = dp[i-1][j];
                } else {
                    // 说明放得下
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
                }
            }
        }
        return dp[nums.length][target];
    }
}
