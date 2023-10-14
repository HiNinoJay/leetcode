package com.ninojay.leetcode190.c二分查找6;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class ThreeFour34 {
    public static void main(String[] args) {

        NinoPrintUtil ninoPrintUtil = new NinoPrintUtil();
        int[] nums = NinoCreationUtil.createOneDimensionArray(5,7,7,8,8,10);
        int target = 6;

        int target1 = 1;
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(1, 3);

        ninoPrintUtil.printOneDimensionArray(searchRange(nums, target));

    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean flag = false;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) {
                flag = true;
                start = mid;
                end = mid;
                while(start - 1 >=0 && nums[start - 1] == target) start--;
                while(end + 1 < nums.length && nums[end + 1] == target) end ++;
                break;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return flag ? new int[] {start, end} : new int[] {-1, -1} ;
    }

}
