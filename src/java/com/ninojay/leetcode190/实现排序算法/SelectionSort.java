package com.ninojay.leetcode190.实现排序算法;

import com.ninojay.leetcode190.util.NinoArrayUtil;
import com.ninojay.leetcode190.util.NinoUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(1,3,5,7,2,6,4,8,9,2,8,7,6,0,3,5,9,4,1,0);
        selection_sort(nums);
        NinoArrayUtil.printOneDimensionArray(nums);
    }

    private static void selection_sort(int[] nums) {
        int temp_min_index;
        for(int i = 0; i < nums.length - 1; i++) {
            temp_min_index = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[temp_min_index]) {
                    temp_min_index = j;
                }
            }
            NinoUtil.swapOneDemensionArray(nums, temp_min_index, i);
        }
    }
}
