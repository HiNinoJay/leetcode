package com.ninojay.leetcode.z周赛;

import java.util.HashMap;

/**
 * @author zengzhongjie
 * @date 2023/2/5
 */
public class SixThreeFourSeven6347 {

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};

        int[] result = vowelStrings(words, queries);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('a', 1);
        hashMap.put('e', 1);
        hashMap.put('i', 1);
        hashMap.put('o', 1);
        hashMap.put('u', 1);


        // 用以记录当前位置是否是符合要求
        int[] flag = new int[words.length];
        // 用以记录当前位置之前，有多少个符合要求
        int[] flag2 = new int[words.length];
        int temp_count = 0;
        for(int i = 0 ; i < words.length; i++) {
            // 说明符合要求
            if(hashMap.containsKey(words[i].charAt(0)) && hashMap.containsKey(words[i].charAt(words[i].length() - 1))) {
                flag[i] = 1;
                temp_count++;
            } else {
                flag[i] = 0;
            }
            flag2[i] = temp_count;
        }

        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            // 这个区间有多少个符合要求
            int temp = flag2[end] - flag2[start];

            // 注释掉的会超时
//            while(start <= end) {
//                if(flag[start] == 1) {
//                    temp++;
//                }
//                start++;
//            }
            // 根据数学规则，当前位置算，要加1
            if(flag[start] == 1) {
                temp++;
            }
            result[i] = temp;
        }
        return result;
    }
}
