package com.ninojay.leetcode190.d排序4;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/16
 */
public class TwoOneFIve215 {
    public static void main(String[] args) {
        int[] nums = NinoCreationUtil.createOneDimensionArray(3,2,1,5,6,4);
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(3,2,3,1,2,4,5,5,6);
        int[] nums2 = NinoCreationUtil.createOneDimensionArray(99, 99);
        int k = 2;
        NinoPrintUtil.printAllType(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        return quickFind(nums, 0, nums.length, nums.length - k + 1);
    }

    private static int quickFind(int[] nums, int start, int end, int k) {
        int left = start;
        int right = end - 1;
        // 注意⚠️，我的快排都采用第一个数，为基准
        swap(nums, left, k -1);
        int key = nums[left];

        while(left < right) {
            while(left < right && nums[right] >= key) right--;
            nums[left] = nums[right];
            while(left < right && nums[left] < key) left++;
            nums[right] = nums[left];
        }
        nums[left] = key;
        if(left + 1 == k) {
            return nums[left];
        }
        return left + 1 < k ? quickFind(nums, left + 1, end, k) : quickFind(nums, start, left, k);
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
