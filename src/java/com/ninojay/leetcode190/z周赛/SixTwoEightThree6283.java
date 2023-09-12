package com.ninojay.leetcode190.z周赛;

/**
 * @author zengzhongjie
 * @date 2023/1/8
 */
public class SixTwoEightThree6283 {
    public static void main(String[] args) {
        int[] data = {-2,-1,-1,1,2,3};
        System.out.println(maximumCount(data));
    }
    private static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                pos++;
            }
            if(nums[i] < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}
