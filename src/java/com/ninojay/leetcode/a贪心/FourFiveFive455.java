package com.ninojay.leetcode.a贪心;

import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.Arrays;

/**
 * @author zengzhongjie
 * @date 2023/1/31
 */
public class FourFiveFive455 {

    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        NinoPrintUtil.printAllType(new FourFiveFive455().findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        for(int i = 0; j < g.length && i < s.length; i++) {
            if(s[i] >= g[j]) {
                j++;
            }
        }
        return j;
    }


}
