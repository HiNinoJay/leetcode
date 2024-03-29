package com.ninojay.leetcode.k字符串10.a字符串比较4;

import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.*;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoFourTwo242 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        NinoPrintUtil.printAllType(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] charsA = s.toCharArray();
        char[] charsB = t.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        return Arrays.equals(charsA, charsB);
    }
}
