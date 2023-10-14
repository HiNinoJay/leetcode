package com.ninojay.leetcode190.a贪心10;

import com.ninojay.leetcode190.util.NinoPrintUtil;

/**
 * @author zengzhongjie
 * @date 2022/12/29
 */
public class OneThreeFive135 {
    public int candy(int[] ratings) {
        int[] data = new int[ratings.length];
        for(int i = 0; i < data.length; i++) {
            data[i] = 1;
        }
        // 从左到右，右侧比自己分数多，则右侧糖果为自己的加1
        for(int i = 0 ; i < data.length - 1; i++) {
            if(ratings[i] < ratings[i+1]) data[i + 1] = data[i] + 1;
        }

        // 从右往左，左侧比自己分数多，糖果还没有自己多，就为自己加1
        for(int j = data.length - 1; j > 0; j--) {
            if(ratings[j] < ratings[j-1] )  data[j-1] = Math.max(data[j-1], data[j] + 1);
        }

        int result = 0;
        for(int i = 0 ; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1, 0 ,2};
        NinoPrintUtil.printAllType(new OneThreeFive135().candy(data));
    }
}
