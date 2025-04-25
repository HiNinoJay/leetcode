package com.ninojay.leetcode.p玩;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

/**
 * @author : nino
 * @date : 2024/10/1 14:58
 */
public class Play02 {


    private int getResult(int[] array) {

        int result1 = Integer.MIN_VALUE;
        int result2 = Integer.MIN_VALUE;

        int[] dp = new int[array.length];
        dp[0] = array[0];
        result1 = dp[0];
        for(int i = 1; i < array.length; i++) {
            dp[i] = Math.max(array[i], dp[i-1] + array[i]);

            if(dp[i] > result1) {
                result2 = result1;
                result1 = dp[i];
            } else if(dp[i] > result2) {
                result2 = dp[i];
            }
        }
        return result1 + result2;
    }


    public static void main(String[] args) {
        // [4, 1, -2, 3] 和 [4, 5]
        int[] array1 = NinoCreationUtil.createOneDimensionArray(1, 1, -4, 4, 1, -2, 3, -9, 4, 5);
        int[] array2 = NinoCreationUtil.createOneDimensionArray(1, 2, -3, 4, 5);
        NinoPrintUtil.printAllType(new Play02().getResult(array1)); // 12
        NinoPrintUtil.printAllType(new Play02().getResult(array2)); // 15

    }
}
