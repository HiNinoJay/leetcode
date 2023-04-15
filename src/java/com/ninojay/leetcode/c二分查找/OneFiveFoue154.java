package com.ninojay.leetcode.c二分查找;

import com.ninojay.leetcode.util.NinoArrayUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class OneFiveFoue154 {
    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(2,2,2,0,1);
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
       int left = 0;
       int right = nums.length - 1;
       while(left <= right) {
           int mid = left + (right - left) / 2;
           if(nums[mid] > nums[right]) {
               // 说明旋转已经过半，那么最小一定在后半部分
               left = mid + 1;
           } else if(nums[mid] < nums[right]) {
               // 说明旋转未过半，那么最小一定在前半部分
               right = mid;
           } else {
               // 相同的情况，往前一个，因为往前一个是会比之后一个小的
               right = right - 1;
           }
       }
       return nums[left];
    }
}
