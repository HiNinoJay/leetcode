package com.ninojay.leetcode.util;

/**
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class NinoUtil {
    public static void swapOneDemensionArray(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
