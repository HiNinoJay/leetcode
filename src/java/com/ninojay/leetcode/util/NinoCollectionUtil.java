package com.ninojay.leetcode.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2023/2/14
 */
public class NinoCollectionUtil {


    public static List<String> createStringArrayList(String... strings) {
        ArrayList<String> result = new ArrayList<String>();
        for(String temp : strings) {
            result.add(temp);
        }
        return result;
    }

    public static void printListListInteger(List<List<Integer>> lists) {
        if(lists == null) {
            System.out.println("无数据可打印");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(List<Integer> list : lists) {
            sb.append("[");
            for(Integer i : list) {
                sb.append(i + ",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("],");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb);
    }

}
