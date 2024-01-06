package com.ninojay.leetcode190.b双指针9;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/14
 */
public class FiveTwoFour524 {

    public static void main(String[] args) {
        // apple
        String s = "abpcplea";
        List<String> dictionary = NinoCreationUtil.createStringArrayList("ale","apple","monkey","plea");

        // a
        String s1 = "abpcplea";
        List<String> dictionary1 = NinoCreationUtil.createStringArrayList("a","b","c");

        // abc
        String s2 = "abce";
        List<String> dictionary2 = NinoCreationUtil.createStringArrayList("abe", "abc");

        // "ewaf"
        String s3 = "aewfafwafjlwajflwajflwafj";
        List<String> dictionary3 = NinoCreationUtil.createStringArrayList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf");

        String s4 = "abpcplea";
        List<String> dictionary4 = NinoCreationUtil.createStringArrayList("ale","apple","monkey","plea", "abpcplaaa","abpcllllll","abccclllpppeeaaaa");

        NinoPrintUtil.printAllType(findLongestWord(s4, dictionary4));
    }

    /**
     * 多个条件判断符合题意的
     * 还是要学会 先写算法的框架
     * 分步拆解去实现
     * 这样思路更清晰
     * @param s
     * @param dictionary
     * @return
     */
    public static String findLongestWord(String s, List<String> dictionary){

        int max_length = -1;
        String result = "";

        for(int i = 0; i < dictionary.size(); i++) {
            String word = dictionary.get(i);
            if(correct(s, word) && (word.length() > max_length || (word.length() == max_length && priority(word, result)))) {
                max_length = word.length();
                result = word;
            }
        }
        return result;
    }



    private static boolean correct(String s, String word) {
        int index_s = 0;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            while(index_s < s.length() && s.charAt(index_s) != c) index_s++;
            if(index_s == s.length()) {
                return false;
            }
            // 匹配到了
            if(s.charAt(index_s) == c) {
                index_s++;
            }
        }
        return true;
    }

    /**
     * String的字典序列可直接使用compareTo方法
     * @param word
     * @param result
     * @return
     */
    private static boolean priority(String word, String result) {
        return word.compareTo(result) <= 0 ? true : false;
    }


}
