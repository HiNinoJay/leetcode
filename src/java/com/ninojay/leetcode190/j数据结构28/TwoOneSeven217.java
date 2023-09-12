package com.ninojay.leetcode190.j数据结构28;

import com.ninojay.leetcode190.util.NinoArrayUtil;

import java.util.HashSet;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoOneSeven217 {
    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(1, 2, 3, 1);
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(hashSet.contains(nums[i])) {
                return true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;
    }
}
