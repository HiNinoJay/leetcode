package com.ninojay.leetcode.j数据结构;

import com.ninojay.leetcode.util.NinoArrayUtil;

import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class One1 {
    public static void main(String[] args) {
        int[] nums = NinoArrayUtil.createOneDimensionArray(2, 7, 11, 15);
        int[] nums1 = NinoArrayUtil.createOneDimensionArray(3, 2, 4);
        int target = 9;
        int target1 = 6;
        NinoArrayUtil.printOneDimensionArray(twoSum(nums1, target1));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {

            if(hashMap.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = hashMap.get(target - nums[i]);
                break;
            }

            hashMap.put(nums[i], i);
        }
        return result;
    }
}
