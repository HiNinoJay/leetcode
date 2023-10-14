package com.ninojay.leetcode190.c二分查找6;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/14
 */
public class SixNine69 {
    public static void main(String[] args) {
        int x = 4;
        NinoPrintUtil.printAllType(mySqrt(x));
    }

    /**
     * 这里是左闭右闭
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
       if(x == 0) {
           return x;
       }
       int left = 1;
       int right = x;
       int mid;
       while(left <= right) {
           // 直接mid = (left + right)/2 有可能溢出
           mid = left + (right - left)/2;
           int sqrt = x / mid;
           if(sqrt == mid) {
               return mid;
           } else if(mid > sqrt) {
               right = mid - 1;
           } else {
               left = mid + 1;
           }
       }
       return right;
    }
}
