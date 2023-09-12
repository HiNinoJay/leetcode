package com.ninojay.leetcode190.z周赛;

import java.util.Arrays;

/**
 * @author zengzhongjie
 * @date 2023/2/5
 */
public class SixThreeFourEight6348 {

    public static void main(String[] args) {

        int data[] = {1,1,1,1};
        int k = 4;
        System.out.println(pickGifts(data, k));
    }


    public static long pickGifts(int[] gifts, int k) {

        for(int i = 0 ; i < k; i++) {
            Arrays.sort(gifts);
            gifts[gifts.length - 1] = (int) Math.sqrt(gifts[gifts.length - 1]);
        }
        long result = 0;
        for(int i = 0 ; i < gifts.length; i++) {
            result += gifts[i];
        }
        return result;
    }
}
