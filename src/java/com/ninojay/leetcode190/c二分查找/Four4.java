package com.ninojay.leetcode190.c二分查找;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/15
 */
public class Four4 {

    public static void main(String[] args) {
        int[] nums1 = NinoCreationUtil.createOneDimensionArray(1, 3);
        int[] nums2 = NinoCreationUtil.createOneDimensionArray(2);
        NinoPrintUtil.printAllType(new Four4().findMedianSortedArrays(nums1, nums2));

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 求中位数，因为知道两个数组的长度，实际上就等于求 第 k 大的数
        // 我们要达到一个log(m + n)的时间复杂度，就是每次去过滤 k/2 的量
        // 直到我们求 k == 1 的时候
        int indexFirstK = (nums1.length + nums2.length + 1) / 2;
        int indexSecondK = (nums1.length + nums2.length + 2) / 2;
        return (getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, indexFirstK) +
                getKth(nums1, 0, nums1.length - 1, nums2, 0, nums2.length - 1, indexSecondK)) * 0.5;
    }

    /**
     * 妙在什么地方
     * 第一个是 将中位数 转换为了 第k大
     * 随后 长度总和为奇数自然是 第k大
     * 还要考虑 长度总和为 偶数 自然还要知道 第 k + 1大
     *
     * 进入当前方法，要留意第一个数组为短的数组，可以使得之后的代码复用性高
     * 考虑 第一个数组过滤完的情况
     * 考虑 末端 只需要求 k 为 1 也就是 第 1 大的数的情况，那么自然只需要比较 两个数组的第一个数
     */
    private int getKth(int[] nums1, int start1, int end1,
                       int[] nums2, int start2, int end2,
                       int k) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;

        if(len1 > len2) {
            return getKth(nums2, start2, end2, nums1, start1, end1, k);
        }

        if(len1 == 0) {
            return nums2[start2 + k - 1];
        }

        if(k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        // 过滤 k / 2 的数，但要注意不要过滤过头了
        int temp1 = start1 + Math.min(len1, k / 2) - 1;
        int temp2 = start2 + Math.min(len2, k / 2) - 1;

        if(nums1[temp1] > nums2[temp2]) {
            return getKth(nums1, start1, end1, nums2, temp2 + 1, end2, k - (temp2 -start2 + 1));
        } else {
            return getKth(nums1, temp1 + 1, end1, nums2, start2, end2, k - (temp1- start1 + 1));
        }



    }

}
