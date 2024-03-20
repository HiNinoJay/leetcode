package com.ninojay.leetcode190.f动态规划28.d子序列;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:00
 */
public class ThreeZeroZero300 {
    public static void main(String[] args) {

        int[] nums = NinoCreationUtil.createOneDimensionArray(10,9,2,5,3,7,101,18);
        NinoPrintUtil.printAllType(new ThreeZeroZero300().lengthOfLIS(nums));
    }

    public int lengthOfLIS(int[] nums) {

        // 动态规划
        // 一维数组 的 dp[2] 代表 nums[2]这个数 当前 最长序列数
        // 那么自然 到了 dp[i]，去找到 从 do[0] 到dp[j](j<i) 的最大数 加 1 即是新的最长

        if(nums.length == 1) {
            return 1;
        }
        int[] dp = new int[nums.length];
        // 先直接赋值为1，因为最短肯定为1
        Arrays.fill(dp, 1);
        int max = 0;

        for(int i = 0; i <  nums.length; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] =  Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
