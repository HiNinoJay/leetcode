package com.ninojay.leetcode190.c二分查找6;

import com.ninojay.leetcode190.util.NinoCreationUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class FiveFourZero540 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1,1,2,3,3,4,4,8,8);
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(3,3,7,7,10,11,11);
        int[] nums2 = NinoCreationUtil.createOneDimensionArray(1);
        System.out.println(singleNonDuplicate(nums1));
    }

    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(mid == nums.length - 1 || mid == 0) {
                return nums[mid];
            }
            int left_length;
            int right_length;
            if(nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]) {
                return nums[mid];
            } else if(nums[mid - 1] == nums[mid]) {
                left_length = mid - left + 1;
                if(left_length % 2 != 0) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                right_length = right - mid + 1;
                if(right_length % 2 != 0) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return nums[left];
    }
}
