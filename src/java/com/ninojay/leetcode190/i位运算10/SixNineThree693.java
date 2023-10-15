package com.ninojay.leetcode190.i位运算10;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:14
 */
public class SixNineThree693 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new SixNineThree693().hasAlternatingBits(Integer.parseInt("1011", 2)));
    }

    public boolean hasAlternatingBits(int n) {
        boolean theSame = false;
        int last = n & 1;
        n >>= 1;
        while(n != 0) {
            int tempLast = n &  1;
            if(tempLast == last) {
                return false;
            }
            last = tempLast;
            n >>= 1;
        }
        return !theSame;
    }
}
