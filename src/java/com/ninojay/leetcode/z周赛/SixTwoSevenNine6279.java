package com.ninojay.leetcode.z周赛;

import java.util.*;

/**
 * @author zengzhongjie
 * @date 2023/1/1
 */
public class SixTwoSevenNine6279 {
    public static void main(String[] args) {
        int[] nums = {100};
        System.out.println(distinctPrimeFactors(nums));
    }

    public static int distinctPrimeFactors(int[] nums) {
        Map<Integer, Integer> base_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 2; j <= num && num != 1; j++) {
                if (num % j == 0) {
                    if (base_map.containsKey(j)) {
                        base_map.put(j, base_map.get(j) + 1);
                    } else {
                        base_map.put(j, 1);
                    }
                    num = num / j;
                    j = 1;
                }
            }
        }
        return base_map.keySet().size();
    }
}