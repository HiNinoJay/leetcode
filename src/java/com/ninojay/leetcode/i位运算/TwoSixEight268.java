package com.ninojay.leetcode.i位运算;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoSixEight268 {

    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(3, 0, 1);
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int realSum = (1 + nums.length) * (nums.length) / 2;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return realSum - sum;
    }
}
