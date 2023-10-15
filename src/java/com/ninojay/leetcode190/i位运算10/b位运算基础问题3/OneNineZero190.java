package com.ninojay.leetcode190.i位运算10.b位运算基础问题3;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneNineZero190 {

    public static void main(String[] args) {
        int n = Integer.parseInt("00000010100101000001111010011100", 2);
        NinoPrintUtil.printAllType(new OneNineZero190().reverseBits(n));
    }

    public int reverseBits(int n) {

        // 熟练掌握二进制左右移
        int answer = 0;
        for(int i = 0; i < 32; i++) {
            answer <<= 1;
            answer += (n & 1);
            n >>= 1;
        }
        return answer;
    }
}
