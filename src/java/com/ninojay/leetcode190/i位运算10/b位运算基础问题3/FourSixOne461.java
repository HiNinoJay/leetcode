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
        NinoPrintUtil.printAllType(new FourSixOne461().hammingDistance(x, y));
    }

    public int hammingDistance(int x, int y) {
        // 汉明距离的意思是
        // 两个二进制数，他们的每一位 不同 个数

        // 直接异或就很方便的求了,关键是学习 下 怎么获取 二进制每一位的

        int target = x^y;
        int result = 0;
        while(target != 0) {
            // 一位一位的与
            result += (target & 1);
            // 去右移
            target >>= 1;
        }
        return result;
    }

}

