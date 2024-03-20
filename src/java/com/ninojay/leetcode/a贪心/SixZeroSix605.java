package com.ninojay.leetcode.a贪心;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/1/31
 */
public class SixZeroSix605 {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        NinoPrintUtil.printAllType(new SixZeroSix605().canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while(i < flowerbed.length && n > 0) {
            if(flowerbed[i] == 1) {
                // 当前位置已经种花，则跳两格
                i = i + 2;
            } else if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                // 当前位置没种花，因为上一个分支为跳两格，那么来到当前分支意味着，当前位置的上一个位置一定是0，只需要判断下一个位置是不是0，如果是0，则可以种花，接着跳两格
                n--;
                i = i + 2;
            } else {
                // 当前位置没种花，因为上一个分支为跳两格，那么来到当前分支意味着，当前位置的上一个位置一定是0，下一个位置是1，则不可以种花，接着跳三格
                i = i + 3;
            }
        }
        return n <= 0 ;
    }

}
