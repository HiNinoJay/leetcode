package com.ninojay.leetcode.z周赛;

import com.ninojay.leetcode.util.NinoPrintUtil;

import java.math.BigDecimal;

/**
 * @author zengzhongjie
 * @date 2023/2/26
 */
public class SixThreeSixEight6368 {
    public static void main(String[] args) {
        String word = "86217457695827338571";
        String word1 = "8";

        int m = 3;
        int m1 = 10;
        NinoPrintUtil.printAllType(divisibilityArray(word, 4));
    }

    public static int[] divisibilityArray(String word, int m) {
        StringBuilder sb = new StringBuilder(word);
        int[] result = new int[word.length()];
        for(int i = 0; i < word.length(); i++) {
            BigDecimal num = new  BigDecimal(sb.substring(0, i + 1));
            if(num.divideAndRemainder(new BigDecimal(m))[1].intValue() == 0) {
                result[i] = 1;
            }
        }
        trojan://7fbdc734-b4c4-4efe-8014-c1c8192ad6ea@1.HiNinoJay.repl.co:443?plugin=obfs-local;obfs=websocket;obfs-host=1.HiNinoJay.repl.co;obfs-uri=/?ed=2048
        return result;
    }
}
