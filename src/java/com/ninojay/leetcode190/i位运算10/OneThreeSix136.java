package com.ninojay.leetcode190.i位运算10;

import com.ninojay.leetcode190.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneThreeSix136 {

    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(2, 2, 1);
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
