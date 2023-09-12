package com.ninojay.leetcode190.实现排序算法;

import com.ninojay.leetcode190.util.NinoArrayUtil;

/**
 * 归并排序
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(1,3,5,7,2,6,4,8,9,2,8,7,6,0,3,5,9,4,1,0);
        merge_sort(nums, 0, nums.length, new int[nums.length]);
        // 左闭右开
        NinoArrayUtil.printOneDimensionArray(nums);
    }

    /**
     * 用的仍然是左闭右开
     * @param nums
     * @param start
     * @param end
     * @param temp
     */
    private static void merge_sort(int[] nums, int start, int end, int[] temp) {
        // 只有一个不用排序
        if(start + 1 >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        merge_sort(nums, start, mid, temp);
        merge_sort(nums, mid, end, temp);
        int first = start;
        int second = mid;
        int i = start;
        while (first < mid || second < end) {
            // 将要归并的两部分，谁小，先临时放到temp数组中
            if (second >= end || (first < mid && nums[first] <= nums[second])) {
                // second >= end 说明第二部分已经放完了，然而代码还进入到这里,说明第一部分还没放完 or 第一部分的数更小
                temp[i++] = nums[first++];
            } else {
                // 说明第二部分的数更小
                temp[i++] = nums[second++];
            }
        }
        // 最后将排好序的[start,end]区间的数，放回原数组
        for (i = start; i < end; ++i) {
            nums[i] = temp[i];
        }
    }
}
