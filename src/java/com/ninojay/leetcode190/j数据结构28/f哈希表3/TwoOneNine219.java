package com.ninojay.leetcode190.j数据结构28.f哈希表3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashMap;

/**
 * @author : zengzhongjie
 * @date : 2024/1/7 16:49
 */
public class TwoOneNine219 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(1, 0, 1, 1);
        int k = 1;
        NinoPrintUtil.printAllType(new TwoOneNine219().containsNearbyDuplicate(nums, k));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(numsMap.containsKey(num)) {
                if(Math.abs(numsMap.get(num) - i) <= k) {
                    return true;
                }
            }
            numsMap.put(num, i);
        }
        return false;
    }
}
