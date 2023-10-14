package com.ninojay.leetcode190.a贪心10;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/10
 */
public class SevenSixThree763{

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        String s1 = "eccbbbbdec";
        String s2 = "qiejxqfnqceocmy";
        NinoPrintUtil.printAllType(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String s) {
        // 记录字符的最右位置
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), i);
        }
        ArrayList<Integer> count = new ArrayList<Integer>();
        // 基本原理，就是直接找到当前字符的最右范围
        // 随后在这个范围中找寻  当中的字符的最右范围有没有超出
        // 超出则设置为新的最右范围
        // 即可找到最长字符串
        for(int i = 0; i <s.length();) {
            char c = s.charAt(i);
            int right = hashMap.get(c);
            for(int left = i + 1; left < right; left++) {
                int num = hashMap.get(s.charAt(left));
                if(num > right) {
                    right = num;
                }
            }
            count.add(right - i + 1);
            i = right + 1;
        }
        return count;
    }
}
