package com.ninojay.leetcode.h数学问题17;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class Nine9 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(isPalindrome(-21));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        if(x < 0) {
            sb.append("-");
        }
        sb.append(Math.abs(x));

        return sb.toString().equals(sb.reverse().toString());
    }
}
