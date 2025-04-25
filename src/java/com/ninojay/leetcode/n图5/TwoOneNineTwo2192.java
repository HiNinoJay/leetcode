package com.ninojay.leetcode.n图5;

import com.ninojay.leetcode.util.NinoCreationUtil;
import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.*;

/**
 * @author : nino
 * @date : 2024/4/4 09:47
 */
public class TwoOneNineTwo2192 {
    public static void main(String[] args) {
        int[][] edges = NinoCreationUtil.createTwoDimensionArray("[[0,7],[7,6],[0,3],[6,3],[5,4],[1,5],[2,7],[3,5],[3,1],[0,5],[7,5],[2,1],[1,4],[6,1]]");
        NinoPrintUtil.printAllType(new TwoOneNineTwo2192().getAncestors(8, edges));
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        Arrays.sort(edges, (edge1, edge2) -> {
            if(edge1[1] == edge2[1]) return edge1[0] - edge2[0];
            else return edge1[1] - edge2[1];
        });
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, HashSet<Integer>> hashMap = new HashMap<>();
        for(int i = 0; i < edges.length; i++) {
            HashSet<Integer> set = hashMap.getOrDefault(edges[i][1], new HashSet<>());
            set.add(edges[i][0]);
            hashMap.put(edges[i][1], set);
        }
        for(int i = 0; i < n; i++) {
            HashSet<Integer> tempResultSet = new HashSet<>();
            HashSet<Integer> hashSet = hashMap.getOrDefault(i, new HashSet<>());
            for(Integer tempInt : hashSet) {
                HashSet<Integer> hashSet1 = hashMap.get(tempInt);
                if(hashSet1 != null && hashSet1.size() > 0) {
                    tempResultSet.addAll(hashSet1);
                }
            }
            tempResultSet.addAll(hashSet);
            List<Integer> tempResult = new ArrayList<>(tempResultSet);
            Collections.sort(tempResult);
            result.add(tempResult);
        }
        return result;
    }
}
