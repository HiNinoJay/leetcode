package com.ninojay.leetcode190.h数学问题17;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:11
 */
public class TwoThreeEight238 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new TwoThreeEight238().productExceptSelf(NinoCreationUtil.createOneDimensionArray(-1,1,0,-3,3)));
    }

    public int[] productExceptSelf(int[] nums) {

        // 前缀和 后缀和 再合并结果 即可
        int[] preSum = new int[nums.length];
        int[] tailSum = new int[nums.length];

        Arrays.fill(preSum, 1);
        Arrays.fill(tailSum, 1);


        for(int i = 1; i  < nums.length; i++) {
            preSum[i] = preSum[i-1] * nums[i-1];
        }

        for(int i = nums.length - 2; i >= 0; i--) {
            tailSum[i] = tailSum[i+1] * nums[i+1];
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            result[i] = preSum[i] * tailSum[i];
        }
        return result;

    }
}
