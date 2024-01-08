package com.ninojay.leetcode190.c二分查找6;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2024/1/8 20:27
 */
public class ThreeFive35 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1, 3, 5, 6);
        int target = 5;
        NinoPrintUtil.printAllType(new ThreeFive35().searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
