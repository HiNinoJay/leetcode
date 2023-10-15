package com.ninojay.leetcode190.h数学问题17;

import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:11
 */
public class OneSixEight168 {
    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new OneSixEight168().convertToTitle(701));
    }
    private Map<Integer, Character> hashMap = new HashMap<>();

    public String convertToTitle(int columnNumber) {

        for(int i = 1; i <= 26; i++) {
            char c = (char)('A' + i - 1);
            hashMap.put(i, c);
        }

        StringBuilder result = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<>();
        while(columnNumber > 26) {
            int num =  columnNumber % 26;
            columnNumber = columnNumber / 26;
            if(num == 0) {
                // 这里 需要注意的是如果余数为0，则要放入‘Z’,前一位 除以26的商要减1
                columnNumber--;
                num = 26;
            }
            stack.push(hashMap.get(num));
        }
        stack.push(hashMap.get(columnNumber));
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
