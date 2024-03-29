package com.ninojay.leetcode.f动态规划.a一维;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/22
 */
public class FourOneThreee413 {
    public static void main(String[] args) {

        int[] nums = NinoCreationUtil.createOneDimensionArray(1, 2, 3, 4);
        NinoPrintUtil.printAllType(new FourOneThreee413().numberOfArithmeticSlices(nums));

    }

    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int result = 0;
        for(int i = 0 ; i < dp.length; i++) {
            result += dp[i];
        }
        return result;
    }
}
