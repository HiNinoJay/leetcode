package com.ninojay.leetcode.d排序.实现排序算法;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

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
        NinoPrintUtil.printAllType(nums);
    }

    /**
     * 这里采用的是左闭右开
     * @param nums
     * @param start
     * @param end
     * @return
     */
    private static void quick_sort(int[] nums, int start, int end) {
        // 只有一个不用排序
        if(start + 1 >= end) {
            return;
        }

        int left = start; // left很关键
        int right = end - 1; // 要减1，因为我们采用的是左闭右开，右当然要减1才能在数组的有效范围

        // 默认用第一个作为key
        int key = nums[left];

        while(left < right) {
            // 先从右往左找 比 key 大的
            while(left < right && nums[right] >= key) right--;
            // 走到这里，意味着出了循环，找到比 key小的
            // 把小的放在左边
            nums[left] = nums[right];

            // 再从左往右找 比 key 小的
            while(left < right && nums[left] <= key) left++;
            // 走到这里，意味着出了循环，找到比 key大的
            // 把大的放在右边
            nums[right] = nums[left];
        }
        // 最后记得把key放回到 left 位置，这时候的left，就是key最合适的位置
        // 所以接着递归也是以 left作为 分界点
        nums[left] = key;
        quick_sort(nums, start, left);
        quick_sort(nums, left + 1, end);
    }


}
