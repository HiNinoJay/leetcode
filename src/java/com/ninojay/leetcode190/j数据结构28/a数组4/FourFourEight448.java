package com.ninojay.leetcode190.j数据结构28.a数组4;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class FourFourEight448 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(4,3,2,7,8,2,3,1);

        NinoPrintUtil.printAllType(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null) return null;
        int[] bukets = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            bukets[nums[i]]++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < bukets.length; i++) {
            if(bukets[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }

}
