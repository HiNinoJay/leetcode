package com.ninojay.leetcode190.z周赛;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zengzhongjie
 * @date 2023/1/8
 */
public class SixTwoEightFour6284 {
    public static void main(String[] args) {
        System.out.println(isItPossible("abcde", "fghij"));
    }

    private static boolean isItPossible(String word1, String word2) {
        Map<Character, Integer> mapWord1 = new HashMap<>();
        Map<Character, Integer> mapWord2 = new HashMap<>();

        List<Character> moreWord1 = new ArrayList<>();
        List<Character> moreWord2 = new ArrayList<>();

        getMapData(word1, mapWord1, moreWord1);
        getMapData(word2, mapWord2, moreWord2);

       for(int i = 0; i < moreWord1.size(); i++) {
           Character c1 = moreWord1.get(i);
           for(int j = 0; j < moreWord2.size(); j++) {
               Character c2 = moreWord2.get(j);

               // word1更换
               if(mapWord1.get(c1) == 1) {
                   mapWord1.remove(c1);
               } else {
                   mapWord1.put(c1, mapWord1.get(c1) -1);
               }

               if(!mapWord2.containsKey(c1)) {
                   mapWord2.put(c1, 1);
               } else {
                   mapWord2.put(c1, mapWord2.get(c1) + 1);
               }

               // word2更换
               if(mapWord2.get(c2) == 1) {
                   mapWord2.remove(c2);
               } else {
                   mapWord2.put(c2, mapWord2.get(c2) - 1);
               }
               if(!mapWord1.containsKey(c2)) {
                   mapWord1.put(c2, 1);
               } else {
                   mapWord1.put(c2, mapWord1.get(c2) + 1);
               }
               if(mapWord1.entrySet().size() == mapWord2.entrySet().size()) {
                   return true;
               }

               // 恢复
               if(mapWord1.get(c2) == 1) {
                   mapWord1.remove(c2);
               } else {
                   mapWord1.put(c2, mapWord1.get(c2) - 1);
               }
               if(mapWord1.containsKey(c1)) {
                   mapWord1.put(c1, mapWord1.get(c1) + 1);
               } else {
                   mapWord1.put(c1, 1);
               }

               if(mapWord2.get(c1) == 1) {
                   mapWord2.remove(c1);
               } else {
                   mapWord2.put(c1, mapWord2.get(c1) - 1);
               }
               if(mapWord2.containsKey(c2)) {
                   mapWord2.put(c2, mapWord2.get(c2) + 1);
               } else {
                   mapWord2.put(c2, 1);
               }
           }
       }

       return false;
    }

    private static void getMapData(String word, Map<Character, Integer> map, List<Character> more) {
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
            more.add(temp);
        }
    }
}
