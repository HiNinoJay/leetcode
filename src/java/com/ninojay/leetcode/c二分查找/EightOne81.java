package com.ninojay.leetcode.c二分查找;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class EightOne81 {
    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(2,5,6,0,0,1,2);
        int[] nums1 = NinoArrayUtil.createOneDimensionArray(1);
        int[] nums2 = NinoArrayUtil.createOneDimensionArray(1, 0, 1, 1, 1);
        int target = 10;

        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        int cut = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i+1 < nums.length && nums[i] > nums[i + 1]) {
                cut = i;
                break;
            }
        }
        return searchBinary(nums, target, 0, cut) || searchBinary(nums, target, cut + 1, nums.length - 1);
    }

    public static boolean searchBinary(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = (end + start) / 2;
            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return false;
    }
}
