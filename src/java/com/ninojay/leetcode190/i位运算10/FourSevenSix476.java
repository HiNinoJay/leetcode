package com.ninojay.leetcode190.i位运算10;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:14
 */
public class FourSevenSix476 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new FourSevenSix476().findComplement(Integer.parseInt("101", 2)));
    }

    public int findComplement(int num) {
        int[] nums = new int[32];

        for(int i = 31; i >= 0 && num != 0; i--) {
            nums[i] = ((num & 1) == 0 ? 1 : 0);
            num >>= 1;
        }
        int ans = 0;

        for(int i = 0; i < 32; i++) {
            if(nums[i] == 1) {
                ans += Math.pow(2, 31-i);
            }
        }
        return ans;
    }
}
