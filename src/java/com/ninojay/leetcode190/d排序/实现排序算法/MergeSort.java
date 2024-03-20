package com.ninojay.leetcode190.d排序.实现排序算法;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * 归并排序
 * 基本远离，就是利用递归，不断划分为两个部分
 * 这两个部分利用一个临时的数组，通过比较得到排好序后的结果
 * 再把排好序的结果，放回到原来的数组对应位置
 * 通过最后递归往回，就能得到最终左右两部分的完全排好序的结果
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class MergeSort {
    public static void main(String[] args) {
        NinoPrintUtil ninoPrintUtil = new NinoPrintUtil();
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,3,5,7,2,6,4,8,9,2,8,7,6,0,3,5,9,4,1,0);
        int[] temp = new int[nums.length];
        merge_sort(nums, 0, nums.length, temp);
        // 左闭右开
        NinoPrintUtil.printAllType(nums);
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
        // 从中间划分左右两个部分
        int mid = start + (end - start) / 2;
        merge_sort(nums, start, mid, temp);
        merge_sort(nums, mid, end, temp);

        int first = start; // 第一部分从左开始
        int second = mid; // 第二部分从划分点开始
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
