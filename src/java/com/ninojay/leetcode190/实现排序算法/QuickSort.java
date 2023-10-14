package com.ninojay.leetcode190.实现排序算法;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * 快排
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class QuickSort {


    public static void main(String[] args) {
        NinoPrintUtil ninoPrintUtil = new NinoPrintUtil();
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,3,5,7,2,6,4,8,9,2,8,7,6,0,3,5,9,4,1,0);
        quick_sort(nums, 0, nums.length);
        // 左闭右开
        ninoPrintUtil.printOneDimensionArray(nums);
    }

    /**
     * 这里采用的是左闭右开
     * @param nums
     * @param start
     * @param end
     * @return
     */
    private static void quick_sort(int[] nums, int start, int end) {
        if(start + 1 >= end) {
            return;
        }
        int left = start;
        int right = end - 1;
        // 默认用第一个作为key
        int key = nums[left];

        while(left < right) {
            while(left < right && nums[right] >= key) right--;
            nums[left] = nums[right];
            while(left < right && nums[left] <= key) left++;
            nums[right] = nums[left];
        }
        nums[left] = key;
        quick_sort(nums, start, left);
        quick_sort(nums, left + 1, end);
    }


}
