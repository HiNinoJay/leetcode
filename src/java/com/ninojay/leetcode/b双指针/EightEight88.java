package com.ninojay.leetcode.b双指针;

import com.ninojay.leetcode.util.NinoArrayUtil;


/**
 * @author zengzhongjie
 * @date 2023/2/13
 */
public class EightEight88 {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        NinoArrayUtil.printOneDimensionArray(nums1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 本质方法是运用了三个指针
       int m_index = m - 1;
       int n_index = n - 1;
       int pos_index = m + n - 1; // 该指针指向最终数组的末尾

       while(m_index >= 0 && n_index >=0) {
           nums1[pos_index--] = nums1[m_index] > nums2[n_index] ? nums1[m_index--] : nums2[n_index--];
       }
       while(n_index >= 0) {
           nums1[pos_index--] = nums2[n_index--];
       }
    }
}
