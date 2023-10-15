package com.ninojay.leetcode190.i位运算10.c二进制特性3;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:13
 */
public class TheeOneEight318 {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        NinoPrintUtil.printAllType(new TheeOneEight318().maxProduct(words));
    }

    public int maxProduct(String[] words) {

        // 利用int 的二进制 26位来表示 该字母
        // 实际上 利用int的二进制，就是把 int当作一个32位的数组，从而可以方便使用位运算

        int ans = 0;

        int[] mask = new int[words.length];
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            int num = 0;
            for(int j = 0; j < word.length(); j++) {
                int n = word.charAt(j) - 'a';
                num |= (1 << n);
            }
            mask[i] = num;
        }

        for(int i = 0; i < mask.length; i++) {
            for(int j = i + 1; j < mask.length; j++) {
                if((mask[i] & mask[j]) == 0) {
                    // 说明完全不一样
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;

    }


}
