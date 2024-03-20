package com.ninojay.leetcode.h数学问题17;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:12
 */
public class OneSixNine169 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(3,2,3);
        NinoPrintUtil.printAllType(new OneSixNine169().majorityElement(nums));
    }


    private Map<Integer, Integer> hashMap = new HashMap<>();

    public int majorityElement(int[] nums) {


        for(int i = 0; i < nums.length; i++) {
            if(!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                if(hashMap.get(nums[i]) > nums.length / 2) {
                    return nums[i];
                }
            }
        }


        return 0;

    }
}
