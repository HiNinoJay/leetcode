package com.ninojay.leetcode.z周赛;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class SixThreeSixNine6369 {

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(10,4,8,3);
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(1);
        NinoPrintUtil.printAllType(leftRigthDifference(nums1));

    }
    public static int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int leftTempSum = 0;
        int rightTempSum = 0;
        for (int i = 1; i < nums.length; i++) {
            leftTempSum += nums[i - 1];
            rightTempSum += nums[nums.length - i];
            leftSum[i] = leftTempSum;
            rightSum[nums.length -1 - i] = rightTempSum;
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}
