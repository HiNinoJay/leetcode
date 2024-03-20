package com.ninojay.leetcode190.f动态规划28;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:05
 */
public class FiveThree53 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(-2,1,-3,4,-1,2,1,-5,4);
        NinoPrintUtil.printAllType(new FiveThree53().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        // dp[2] 代表的是 从 2 往前的 最大子序列和
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = dp[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}
