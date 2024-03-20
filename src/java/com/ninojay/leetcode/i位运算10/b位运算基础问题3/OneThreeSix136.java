package com.ninojay.leetcode.i位运算10.b位运算基础问题3;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneThreeSix136 {

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(2, 2, 1);
        NinoPrintUtil.printAllType(new OneThreeSix136().singleNumber(nums));
    }

    public int singleNumber(int[] nums) {

        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}
