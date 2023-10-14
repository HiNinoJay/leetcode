package com.ninojay.leetcode190.h数学问题17;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoSeven27 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(3, 2, 2, 3);
        int val = 3;
        NinoPrintUtil.printAllType(removeElement(nums, val));

    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(val != nums[i]) {
                swap(nums, i, index);
                index++;
                result++;
            }
        }
        return result;
    }
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
