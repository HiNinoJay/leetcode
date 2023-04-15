package com.ninojay.leetcode.a贪心;

import java.util.Arrays;

/**
 * @author zengzhongjie
 * @date 2023/2/10
 */
public class FourFiveTwo452 {

    public static void main(String[] args) {
        int[][] points1 = {{10,16},{2,8},{1,6},{7,12}};
        int[][] points2 = {{1,2},{3,4},{5,6},{7,8}};
        int[][] points3 = {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(findMinArrowShots(points3));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (o1, o2) -> o1[0] >= o2[0] ? 1 : -1);
        int startRight = points[0][1];
        int result = 1;
        for(int i = 1 ; i < points.length; i++) {
            if(points[i][0] <= startRight) {
                // 取最小的  x最右范围
                if(startRight > points[i][1]) {
                    startRight = points[i][1];
                }
            } else {
                result++;
                startRight = points[i][1];
            }
        }
        return result;
    }
}
