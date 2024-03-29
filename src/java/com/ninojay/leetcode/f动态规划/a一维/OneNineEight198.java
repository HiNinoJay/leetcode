package com.ninojay.leetcode.f动态规划.a一维;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/21
 */
public class OneNineEight198 {

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(2,7,9,3,1);
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(1,1);
        NinoPrintUtil.printAllType(new OneNineEight198().robByO1Zone(nums1));

    }
    public int rob(int[] nums) {
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
