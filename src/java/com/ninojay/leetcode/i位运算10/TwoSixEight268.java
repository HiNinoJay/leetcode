package com.ninojay.leetcode.i位运算10;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoSixEight268 {

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(3, 0, 1);
        NinoPrintUtil.printAllType(new TwoSixEight268().missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        return ((1 + nums.length)*nums.length/2) - sum;
    }
}
