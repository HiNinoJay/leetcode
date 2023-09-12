package com.ninojay.leetcode190.j数据结构28;

import java.util.LinkedList;

/**
 * @author zengzhongjie
 * @date 2023/2/27
 */
public class TwoZero20 {

    public static void main(String[] args) {
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(}"));
//        System.out.println(isValid("("));
        System.out.println(isValid("([}}])"));
    }

    public static boolean isValid(String s) {

        if(s.length() % 2 != 0) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                boolean flag = false;
                if(c == ')') {
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        flag = true;
                    }
                }
                if(c == ']') {
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        flag = true;
                    }
                }
                if(c == '}') {
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                        flag = true;
                    }
                }
                if(!flag) return false;
            }
        }
        return stack.isEmpty() ? true : false;

    }
}
