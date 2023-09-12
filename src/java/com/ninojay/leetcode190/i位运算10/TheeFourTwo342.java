package com.ninojay.leetcode190.i位运算10;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TheeFourTwo342 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfFour(int n) {
        // 如果 n 是 2 的倍数，那么n 的 二进制就是 100000...0类型
        // n-1 的二进制就是 011111...1
        // 所以如果n是2的倍数，那么 n & (n-1)就应该为0
        // 这里求n是否是4的倍数，那么n一定是2的倍数
        int n1 = n & (n-1); // 求n是否是2的倍数，是的话 n1 == 0

        // 而四的倍数 的 二进制的1 一定是 奇数
        // 4的幂和2的幂一样，只会出现一位1。但是，4的1总是出现在奇数位
        // 1431655765 的二进制 1010101010101010101010101010101 (4进制的1可能出现的位置)
        int n2 = n & 1431655765; // 不为0，则说明有奇数个1,则为四的倍数
        return n > 0 && (n1 == 0) && n2 != 0;
    }
}
