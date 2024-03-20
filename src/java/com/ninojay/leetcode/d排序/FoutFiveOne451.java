package com.ninojay.leetcode.d排序;

import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 桶排序
 * @author zengzhongjie
 * @date 2023/2/17
 */
public class FoutFiveOne451 {
    public static void main(String[] args) {
        String s = "tree";
        String s1 = "cccaaa";
        String s2 = "Aabb";
        String s3 = "eeeee";
        NinoPrintUtil.printAllType(new FoutFiveOne451().frequencySort(s3));
    }

    public String frequencySort(String s) {

        HashMap<Character, Integer> s_hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!s_hashMap.containsKey(s.charAt(i))) {
                s_hashMap.put(s.charAt(i), 1);
            } else {
                s_hashMap.put(s.charAt(i), s_hashMap.get(s.charAt(i)) + 1);
            }
        }
        ArrayList<Character>[] buckets = new ArrayList[s.length()+1];

        for(Map.Entry entry : s_hashMap.entrySet()) {
            int count = (Integer)entry.getValue();
            Character c = (Character)entry.getKey();
            if(buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = buckets.length - 1; i >= 0; i--) {
            if(buckets[i] != null) {
                for(Character c : buckets[i]) {
                    for(int j = 0; j < i; j++) {
                        stringBuilder.append(c);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

}
