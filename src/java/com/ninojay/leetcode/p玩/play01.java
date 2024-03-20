package com.ninojay.leetcode.p玩;

import java.util.Scanner;

/**
 * @author : nino
 * @date : 2024/3/20 19:37
 */
public class play01 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // 选两个下标i，j，满足如下要求：
//        int[] nums = {1,2,3,1};
//        int k = 3; // abs(i-j) <=t
//        int t = 0; // abs(nums[i] - nums[j]) <= k
//        NinoPrintUtil.printAllType(new play01().getResult(nums, k, t));
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] values = input.substring("nums=".length(), input.length()).split(",");

        int[] nums = new int[values.length];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(values[i]);
        }
        input = scanner.nextLine().trim();
        Integer k = Integer.parseInt(input.substring("k=".length(), input.length()));
        input = scanner.nextLine().trim();
        Integer t = Integer.parseInt(input.substring("t=".length(), input.length()));

        System.out.println(getResult(nums, k, t));

    }

    private static boolean getResult(int[] nums, int k, int t) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int tempK = j - i;
                if(tempK > k) {
                    break;
                }
                if(Math.abs(nums[i] - nums[j]) <= t) {
                    return true;
                }
            }
        }
        return false;
    }
}
