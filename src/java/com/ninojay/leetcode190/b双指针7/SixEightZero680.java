package com.ninojay.leetcode190.b双指针7;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2023/2/14
 */
public class SixEightZero680 {
    public static void main(String[] args) {
        String s = "abca"; // true
        String s1 = "deeee"; // true
        String s2 = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";// true
        String s3 = "abc";
        NinoPrintUtil.printAllType(validPalindrome(s3));

    }

    /**
     * 等价情况容易考虑的不全面
     * @param s
     * @return
     */
    public static boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                // 这里就说明已经删除了一个
                // 要考虑完整，删除最右 和 删除最左 都是 等价的情况
                return validPalindrome(s, left, right - 1) || validPalindrome(s, left + 1, right);
            }
        }
        return true;
    }

    private static boolean validPalindrome(String s, int left, int right) {
        for(int i = left; i <= right; i++, right--) {
            if(s.charAt(i) != s.charAt(right)) return false;
        }
        return true;
    }
}
