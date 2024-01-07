package com.ninojay.leetcode190.j数据结构28.f哈希表3;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashMap;

/**
 * @author : zengzhongjie
 * @date : 2024/1/7 16:44
 */
public class TwoNineZero290 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new TwoNineZero290().wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> c2s = new HashMap<>();
        HashMap<String, Character> s2c = new HashMap<>();
        String[] sArray = s.split(" ");

        if(pattern.length() != sArray.length) {
            return false;
        }


        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String oneS = sArray[i];
            if(!c2s.containsKey(c)) {
                // 如果没有
                if(s2c.containsKey(oneS)) {
                    return false;
                }
                c2s.put(c, oneS);
                s2c.put(oneS, c);
            } else {
                // 如果有，并且匹配
                if(c2s.get(c).equals(oneS) && s2c.get(oneS) == c) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
