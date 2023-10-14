package com.ninojay.leetcode190.i位运算10.b位运算基础问题3;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class FourSixOne461 {

    public static void main(String[] args) {
        int x = 3;
        int y = 1;
        NinoPrintUtil.printAllType(hammingDistance(x, y));
    }

    public static int hammingDistance(int x, int y) {
        int temp = x ^ y;
        int count = 0;
        while(temp != 0) {
            count = count + (temp & 1);
            temp = temp >> 1;
        }
        return count;
    }

}

