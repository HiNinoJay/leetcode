package com.ninojay.leetcode190.z周赛;

/**
 * @author zengzhongjie
 * @date 2023/1/1
 */
public class SixTwoSevenEight6278 {
    public static void main(String[] args) {
        System.out.println(countDigits(1248));
    }

    public static int countDigits(int num) {
        int count = 0;
        int like_num = num;

        while (like_num != 0) {
            int temp_num = like_num % 10;
            if(num % temp_num == 0) {
                count++;
            }
            like_num = like_num / 10;
        }
        return count;

    }
}
