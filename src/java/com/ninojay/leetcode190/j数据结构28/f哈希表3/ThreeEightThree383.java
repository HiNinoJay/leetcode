package com.ninojay.leetcode190.j数据结构28.f哈希表3;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashMap;

/**
 * @author : zengzhongjie
 * @date : 2024/1/6 09:20
 */
public class ThreeEightThree383 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new ThreeEightThree383().canConstruct("aa", "ab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for(int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if(magazineMap.containsKey(c)) {
                magazineMap.put(c, magazineMap.get(c) + 1);
            } else {
                magazineMap.put(c, 1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if(!magazineMap.containsKey(c)) {
                return false;
            }
            if(magazineMap.get(c) == 1) {
                magazineMap.remove(c);
            } else {
                magazineMap.put(c, magazineMap.get(c) - 1);
            }
        }
        return true;
    }
}
