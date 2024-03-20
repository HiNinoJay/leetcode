package com.ninojay.leetcode.b双指针;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2024/1/6 09:14
 */
public class ThreeNineTwo392 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new ThreeNineTwo392().isSubsequence("abc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) {
            return false;
        }
        int sIndex = 0;
        for(int tIndex = 0; tIndex < t.length(); tIndex++) {
            if(sIndex == s.length()) {
                return true;
            }
            if(t.charAt(tIndex) != s.charAt(sIndex)) {
                continue;
            }
            sIndex++;
        }
        if(sIndex == s.length()) {
            return true;
        }
        return false;
    }
}
