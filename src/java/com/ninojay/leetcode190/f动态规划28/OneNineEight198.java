package com.ninojay.leetcode190.f动态规划28;

import com.ninojay.leetcode190.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/21
 */
public class OneNineEight198 {

    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(2,7,9,3,1);
        int[] nums1 = NinoArrayUtil.createOneDimensionArray(1,1);
        System.out.println(robByO1Zone(nums1));

    }
    public static int rob(int[] nums) {
        if(nums == null) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);
        }

        return dp[nums.length];
    }

    public static int robByO1Zone(int[] nums) {
        if(nums == null) {
            return 0;
        }

        int pre1 = 0;
        int pre2 = 0;
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            result = Math.max(pre2, pre1 + nums[i]);
            pre1 = pre2;
            pre2 = result;
        }

        return result;
    }
}
