package com.ninojay.leetcode.h数学问题17;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:11
 */
public class FourSixTwo462 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new FourSixTwo462().minMoves2(NinoCreationUtil.createOneDimensionArray(1,10,2,9)));
    }

    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int result = 0;
        // 数学方法  t取 中位数 即可得到 两边数字的最短距离
        int target = nums[(nums.length - 1) / 2];
        for(int num : nums) {
            result += Math.abs(target - num);
        }
        return result;
    }
}
