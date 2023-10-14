package com.ninojay.leetcode190.i位运算10.b位运算基础问题3;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneNineZero190 {

    public static void main(String[] args) {
        int n = Integer.parseInt("00000010100101000001111010011100", 2);
        NinoPrintUtil.printAllType(reverseBits(n));
    }

    public static int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
