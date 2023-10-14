package com.ninojay.leetcode190.j数据结构28.f哈希表3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class One1 {
    public static void main(String[] args) {
        NinoPrintUtil ninoPrintUtil = new NinoPrintUtil();
        int[] nums = NinoCreationUtil.createOneDimensionArray(2, 7, 11, 15);
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(3, 2, 4);
        int target = 9;
        int target1 = 6;
        ninoPrintUtil.printOneDimensionArray(twoSum(nums1, target1));

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
