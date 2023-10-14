package com.ninojay.leetcode190.d排序4;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/17
 */
public class SevenFive75 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(2,0,1);
        sortColors(nums);
        NinoPrintUtil.printAllType(nums);
    }



    public static void sortColors(int[] nums) {
        int[] buckets = new int[3];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                buckets[0]++;
            } else if(nums[i] == 1) {
                buckets[1]++;
            } else {
                buckets[2]++;
            }
        }

        int index = 0;
        for(int i = 0 ; i < buckets.length; i++) {
            for(int j = 0; j < buckets[i]; j++) {
                nums[index++] = i;
            }
        }
    }
}
