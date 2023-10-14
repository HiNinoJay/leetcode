package com.ninojay.leetcode190.实现排序算法;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;
import com.ninojay.leetcode190.util.NinoUtil;

/**
 * 冒泡排序
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class BubbleSort {

    public static void main(String[] args) {
        NinoPrintUtil ninoPrintUtil = new NinoPrintUtil();
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,3,5,7,2,6,4,8,9,2,8,7,6,0,3,5,9,4,1,0);
        bubble_sort(nums);
        ninoPrintUtil.printOneDimensionArray(nums);
    }

    private static void bubble_sort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j + 1 < nums.length; j++) {
                if(nums[j + 1] < nums[j]) {
                    NinoUtil.swapOneDemensionArray(nums, j, j + 1);
                }
            }
        }
    }
}
