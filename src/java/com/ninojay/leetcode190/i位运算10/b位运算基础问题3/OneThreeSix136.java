package com.ninojay.leetcode190.i位运算10.b位运算基础问题3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneThreeSix136 {

    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(2, 2, 1);
        NinoPrintUtil.printAllType(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
