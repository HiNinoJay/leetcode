package com.ninojay.leetcode.z周赛;

import java.util.Arrays;

/**
 * @author zengzhongjie
 * @date 2023/2/12
 */
public class SixThreeFiveFive6355 {

    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5}; // 0 1 4 4 5 7
        int[] nums1 = {1,7,9,2,5}; // 1 2 5 7 9
        int lower = 11;
        int upper = 11;
        System.out.println(countFairPairs(nums1, lower, upper));
    }

    /**
     * todo 超时了
     * @param nums
     * @param lower
     * @param upper
     * @return
     */
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        int right = nums.length - 1;
        long result = 0l;
        int max_right = right;

        for(int i = 0; i < nums.length && i < max_right; i++) {
            boolean flag = false;
            right = max_right;
            while(i < right) {
                int count = nums[i] + nums[right];
                if(count < lower) {
                    break;
                }
                if(count >= lower && count <= upper) {
                    result++;
                    if(!flag) {
                        max_right = right;
                        flag = true;
                    }
                }
                right--;
            }
        }
        return result;
    }
}
