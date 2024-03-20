package com.ninojay.leetcode.k字符串10;

import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2024/1/7 17:01
 */
public class FiveEight58 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new FiveEight58().lengthOfLastWord("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        String[] sArray = s.split(" ");
        int result = -1;
        for(int i = sArray.length -1; i >= 0; i--) {
            if(sArray[i].equals(" ")) {
                continue;
            } else {
                result = sArray[i].length();
                break;
            }
        }
        return result;
    }
}
