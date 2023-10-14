package com.ninojay.leetcode190.h数学问题17;

import com.ninojay.leetcode190.util.NinoPrintUtil;
import com.ninojay.leetcode190.util.NinoUtil;

/**
 * @author : zengzhongjie
 * @date : 2023/9/13 00:11
 */
public class SixSeven67 {

    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new SixSeven67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {

        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        StringBuilder result = new StringBuilder();
        boolean flag = false;

        while(indexA >= 0 || indexB >= 0) {
            int numA = indexA >= 0 ? a.charAt(indexA--) - '0' : 0;
            int numB = indexB >= 0 ? b.charAt(indexB--) - '0': 0;
            if((numA ^ numB) == 1) {
                // 说明两者不一样
                if(flag) {
                    result.append("0");
                    flag = true;
                } else {
                    result.append("1");
                }
            } else {
                // 说明两者一样
                if(numA == 0 && numB == 0) {
                    // 两个都为0
                    if(flag) {
                        result.append("1");
                        flag = false;
                    } else {
                        result.append("0");
                    }
                } else {
                    // 这里就是两个都为1 要进位
                    if(flag) {
                        result.append(1);
                    } else {
                        result.append("0");
                    }
                    flag = true;
                }
            }

        }
        if(flag) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}
