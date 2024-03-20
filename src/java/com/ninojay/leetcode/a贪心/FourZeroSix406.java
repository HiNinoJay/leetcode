package com.ninojay.leetcode.a贪心;

import com.ninojay.leetcode.util.NinoPrintUtil;

import java.util.*;

/**
 * @author zengzhongjie
 * @date 2023/2/11
 */
public class FourZeroSix406 {

    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        //      排序后：  [[7,0],[7,1],[6,1],[5,2],[5,0],[4,4]]
        //  [[7,0],
        //  [[7,0],[7,1],
        //  [[7,0],[6,1],[7,1],
        //  [[7,0],[6,1],[5,2],[7,1],
        //  [[5,0],[7,0],[6,1],[5,2],[7,1],
        //       结果:   [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]

        int[][] people2 = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        int[][] people3 = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}};

        NinoPrintUtil.printAllType(new FourZeroSix406().reconstructQueue(people3));
    }

    public int[][] reconstructQueue(int[][] people) {
        // 先按照身高直接排序
        Arrays.sort(people, (o1, o2) -> {
            // 如果第一个身高元素相同，则相同身高情况下，按照第二个元素升序
            if (o1[0] == o2[0]) {
                return o1[1]- o2[1];
            }
            // 按照第一个身高元素降序
            return o2[0]-o1[0];
        });
        ArrayList<int[]> result = new ArrayList<>(people.length);
        for(int i = 0; i < people.length; i++) {
            result.add(people[i][1], people[i]);
        }
        int[][] returnResult = new int[people.length][];
        for(int i = 0; i < result.size(); i++) {
            returnResult[i] = result.get(i);
        }
        return returnResult;
    }
}
