package com.ninojay.leetcode190.b双指针;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/13
 */
public class OneSisSeven167 {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        NinoPrintUtil.printAllType(new OneSisSeven167().twoSum(numbers, target));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        // 因为是找到首要的第一个，所以一定能到对应位置
        while(left < right) {
            int temp = numbers[left] + numbers[right];
            if(temp == target) {
                break;
            }
            if(temp < target) {
                left++;
            }
            if(temp > target) {
                right--;
            }
        }

        int[] result = new int[2];
        result[0] = left + 1;
        result[1] = right + 1;
        return result;
    }
}
