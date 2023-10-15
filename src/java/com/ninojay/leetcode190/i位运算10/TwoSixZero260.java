package com.ninojay.leetcode190.i位运算10;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashSet;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:14
 */
public class TwoSixZero260 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new TwoSixZero260().singleNumber(NinoCreationUtil.createOneDimensionArray(1, 2, 1, 3, 2, 5)));
    }

    public int[] singleNumber(int[] nums) {

        int result = 0;
        int[] ans = new int[2];
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums) {
            result ^= num;
            if(!hashSet.contains(num)) {
                hashSet.add(num);
            }
        }
        int index =  0;

        for(int num : nums) {
            if(hashSet.contains(num ^ result)) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}
