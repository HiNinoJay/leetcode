package com.ninojay.leetcode190.b双指针;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/13
 */
public class SevenSix76 {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        NinoPrintUtil.printAllType(new SevenSix76().minWindow(s, t));
    }

    /**
     * 滑动窗口
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.put(c, hashMap.get(c) + 1);
            }
        }

        int left = 0;
        int count_size = 0;
        int retrun_min_left = 0;
        int return_min_size = s.length() + 1; // 先来比s的长度还长，过程中找到匹配的就更新更小的长度，如果最后还是比s长度还长，说明没有匹配的

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if(hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) - 1);

                if(hashMap.get(c) >= 0) {
                    count_size++;
                }
                // 说明已经有符合的了
                while(count_size == t.length()) {

                    // 临时记录一下满足条件的长度
                    if(right - left + 1 < return_min_size) {
                        // 如果比已经记录的还要短，更新
                        retrun_min_left = left;
                        return_min_size = right - left + 1;
                    }

                    // 因为要便利到末尾，之后可能还有更短的可能
                    char temp_c = s.charAt(left);
                    if(hashMap.containsKey(temp_c)) {
                        // 所以要将left坐标往右边走一位
                        // 这一位就要对应的调整
                        hashMap.put(temp_c, hashMap.get(temp_c) + 1);
                        if(hashMap.get(temp_c) > 0) {
                            count_size--;
                        }
                    }
                    left++;
                }
            }
        }
        return return_min_size > s.length() ? "" : s.substring(retrun_min_left, retrun_min_left + return_min_size);
    }
}
