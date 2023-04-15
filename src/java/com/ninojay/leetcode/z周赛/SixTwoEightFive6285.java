package com.ninojay.leetcode.z周赛;

import java.util.PriorityQueue;

/**
 * @author zengzhongjie
 * @date 2023/1/8
 */
public class SixTwoEightFive6285 {
    public static void main(String[] args) {
        int[] data = {1,10,3,3,3};
        int k = 3;
        System.out.println(maxKelements(data, k));
    }

    private static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int i = 0 ; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        long result = 0L;
        for(int i = 0 ; i < k ; i++) {
          int temp = maxHeap.poll();
          result = result + temp;
          if(temp % 3 == 0) {
              maxHeap.add(temp / 3);
          } else {
              maxHeap.add(temp / 3 + 1);
          }
        }
        return result;
    }
}
