package com.ninojay.leetcode.i位运算;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class OneNineZero190 {

    public static void main(String[] args) {
        int n = Integer.parseInt("00000010100101000001111010011100", 2);
        System.out.println(reverseBits(n));
    }

    public static int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
