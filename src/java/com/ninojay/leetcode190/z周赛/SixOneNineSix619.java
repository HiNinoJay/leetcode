package com.ninojay.leetcode190.z周赛;

/**
 * @author zengzhongjie
 * @date 2023/1/1
 */
public class SixOneNineSix619 {
    public static void main(String[] args) {
        System.out.println(minimumPartition("238182", 5));

    }

    public static int minimumPartition(String s, int k) {
        int count = 0;
        int temp_k = k;
        int max_length = 0;
        // 得到分割部分的最大位数
        while(temp_k != 0) {
            temp_k = temp_k / 10;
            max_length++;
        }
        String temp_s = s;
        while(s.length() > 0) {
            if(s.length() >= max_length) {
                temp_s = s.substring(0, max_length);
                s = s.substring(max_length);
            } else {
                temp_s = s;
                s = "";
            }
            int num = Integer.parseInt(temp_s);
            if(num > k) {
                if(num < 10) {
                    count = -1;
                    break;
                }
                s = num % 10 + s;
            }
            count++;
        }
        return count;
    }
}
