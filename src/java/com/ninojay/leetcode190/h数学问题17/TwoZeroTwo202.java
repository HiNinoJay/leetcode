package com.ninojay.leetcode190.h数学问题17;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:12
 */
public class TwoZeroTwo202 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new TwoZeroTwo202().isHappy(19));
    }

    public boolean isHappy(int n) {

        // 注意有以下可能：
        // 1.最终会得到1
        // 2.最终会进入循环：如  58 -> 58

        // 这个有点意思
        // 使用快慢指针想法
        // 相遇时，如果当前是由1引起的，则为快乐数
        int slow = n;
        int fast = n;

        do{
            slow = getBitSum(slow);
            fast = getBitSum(fast);
            fast = getBitSum(fast);
        } while (slow != fast);
        return slow == 1;

    }

    private int getBitSum(int n) {
        int sum = 0;
        while(n != 0) {
            int a = n % 10;
            sum += (a * a);
            n /= 10;
        }
        return sum;
    }
}
