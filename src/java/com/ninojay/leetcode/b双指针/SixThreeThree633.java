package com.ninojay.leetcode.b双指针;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/14
 */
public class SixThreeThree633 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new SixThreeThree633().judgeSquareSum(2147483600));
    }

    /**
     * 判断要以平方根为末尾
     * 还要用long类型
     * 因为要是left稍微大一点
     * 加一起来就会超过int的范围
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {

        long left = 0;
        long right = (long) Math.sqrt(c);
        while(left <= right) {
            long temp = left*left + right*right;
            if(temp == c) {
                return true;
            }
            if(temp < c) {
                left++;
            }
            if(temp > c) {
                right--;
            }
        }
        return false;
    }
}
