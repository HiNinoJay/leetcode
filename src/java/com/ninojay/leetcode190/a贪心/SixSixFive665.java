package com.ninojay.leetcode190.a贪心;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/11
 */
public class SixSixFive665 {

    public static void main(String[] args) {
        int[] nums = {4,2,1}; // false  2,2,1 -> 2,2,2
        int[] nums1 = {5,7,1,8}; // true  5,7,7,8
        int[] nums2 = {4,2,3}; // true  2,2,3
        int[] nums3 = {-1,4,2,3}; // true -1,-1,2,3
        int[] nums4 = {3,4,2,3};// fasle  3,3,2,3
        NinoPrintUtil.printAllType(new SixSixFive665().checkPossibility(nums));
    }

    public boolean checkPossibility(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        boolean changed = false;

        for(int i = 0; i < nums.length; i++) {
            // 0下标位非递减，直接替换为1下标位
            if(i == 0 && nums[i+1] < nums[i]) {
                nums[i] = nums[i+1];
                changed = true;
            }
            if(i-1 >=0 && nums[i] < nums[i-1]) {
                // 一旦之前更改过，那么一定是不满足
                if(changed) {
                    return false;
                }
                // 走到这里说明    a < b > c
                if(i-2 >= 0 && nums[i-2] <= nums[i]) {
                    // 如果 a < c，我们要最优
                    // 那么将b改为a是最优  a = a（b） < c
                    nums[i-1] = nums[i-2];
                } else {
                    // 这里说明  a < b > c 且 a > c
                    // 要满足非递减，那么必须 c 改为 b
                    nums[i] = nums[i-1];
                }
                changed = true;
            }
        }
        return true;
    }
}
