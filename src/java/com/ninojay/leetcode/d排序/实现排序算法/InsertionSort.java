package com.ninojay.leetcode.d排序.实现排序算法;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;
import com.ninojay.leetcode.util.NinoUtil;

/**
 * 插入排序
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,3,5,7,2,6,4,8,9,2,8,7,6,0,3,5,9,4,1,0);
        insertion_sort(nums);
        NinoPrintUtil.printAllType(nums);
    }

    /**
     * 已经排好序后
     * 进行从尾往前插入
     * @param nums
     */
    private static void insertion_sort(int[] nums ) {
        for(int i = 0; i < nums.length; i++) {
            // j 对比 j 前一位即可
            for(int j = i; j > 0 && nums[j] < nums[j-1]; j--) {
                NinoUtil.swapOneDemensionArray(nums, j, j-1);
            }
        }
    }
}
