package com.ninojay.leetcode190.b双指针9;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author : zengzhongjie
 * @date : 2024/1/6 08:53
 */
public class OneTwoFive125 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new OneTwoFive125().isPalindrome("A man, a plan, a canal: Panama"));
        NinoPrintUtil.printAllType(new OneTwoFive125().isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left <= right) {
            while(left < s.length() && !isValid(s.charAt(left))) {
                left++;
            }
            if(left > right) {
                break;
            }

            while(right >= 0 && !isValid(s.charAt(right))) {
                right--;
            }
            if(left > right) {
                break;
            }

            if(!isTheSame(s.charAt(left), s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(char c) {
        return isCharacter(c) || isNumber(c);
    }

    private boolean isCharacter(char c) {
        if(c >= 'a' && c <= 'z') {
            return true;
        }
        if(c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;

    }

    private boolean isNumber(char c) {
        if(c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    private boolean isTheSame(char a, char b) {
        if(isCharacter(a) && isCharacter(b)) {
            int num = 'a' - 'A';
            if(a == b) {
                return true;
            }
            if(a + num == b || b + num == a) {
                return true;
            }
            return false;
        }
        if(isCharacter(a) && isNumber(b)) {
            return false;
        }
        if(isNumber(b) && isCharacter(a)) {
            return false;
        }
        return a == b;
    }
}
