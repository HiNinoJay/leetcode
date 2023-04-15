package com.ninojay.leetcode.z周赛;

/**
 * @author zengzhongjie
 * @date 2023/2/12
 */
public class SixThreeFiveFour6354 {

    public static void main(String[] args) {
        int[] nums = {7,52,2,4};
        int[] nums1 = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(nums1));

    }

    public static long findTheArrayConcVal(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        long result = 0l;

        while(left < right) {
            int count = Integer.parseInt(Integer.valueOf(nums[left]).toString() + Integer.valueOf(nums[right]).toString());
            result += count;
            left++;
            right--;
        }
        if(left == right) {
            result = result + nums[left];
        }
        return result;

    }
}
