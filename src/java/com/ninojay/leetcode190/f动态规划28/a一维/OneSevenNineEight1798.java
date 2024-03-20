package com.ninojay.leetcode190.f动态规划28.a一维;

import com.ninojay.leetcode190.util.NinoCreationUtil;
import com.ninojay.leetcode190.util.NinoPrintUtil;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author : zengzhongjie
 * @date : 2024/1/20 21:52
 */
public class OneSevenNineEight1798 {


    public static void main(String[] args) {
        NinoPrintUtil.printAllType(new OneSevenNineEight1798().getMaximumConsecutive(NinoCreationUtil.createOneDimensionArray(1,89,8,1,47,34,99,1,1,1,55,89,1,52,36,1,62,1,1,1,4,27,1,45,1,1,48,1,94,1,63)));
        NinoPrintUtil.printAllType(new OneSevenNineEight1798().getMaximumConsecutive(NinoCreationUtil.createOneDimensionArray(1,1,172,1,681,76,810,1,1,114,623,898,1,864,751,1,766,1,1,1,336,1,1,1,1,1,1,285,988,1,466,250,965,754,347,1,561,1,1,1,999,1,1,329,1,1,1,509,78,291,1,1,1,391,205,1,196,238,764,1,1,1,128,838,209,289,462,90,1,439,1,1,793,1,749,129,1,824,1,1,81,1,205,1,785,581,790,1,1,717,333,299,1,1,62,1,388,1,1,1,269,913,909,824,194,1,1,1,1,551,1,1,1,943,1,498,343,1,901,766,118,1,1,1,43,454,488,1,961,840,324,214,1,1,574,1,1,926,8,406,263,30,478,419,129,1,1,1,1,428,698,182,1,1,1,1,1,1,329,849,293,122,877,1,997,1,416,315,776,607,1,1,1,125,414,1,769,1,1,1,463,1,1,66,1,1,360,1,485,1,1,225,817,1,1,1,1,1,40,1,827,1,560,904,193,145,557,811,1,1,116,649,113,422,771,1,415,1,105,935,282,2,1,1,1,1,1,1,531,797,1,1,1,1,1,1,577,900,1,1,964,790,1,1,292,1,1,1,765,1,369,483,1,1,1,167,1,1,1,813,1,115,416,483,1,152,1,522,1,1,548,1,833,591,822,1,1,157,1,805,1,1,1,1,218,522,346,1,1,809,1,275,934,169,1,120,1,1,811,1,922,125,1,1,967,572,179,1,360,1,1,1,568,1,389,1,1,695,1,1,778,631,704,465,1,80,1)));
    }

    public int getMaximumConsecutive(int[] coins) {

        Arrays.sort(coins);
        int n = coins.length;
        HashSet<Integer> preMay = new HashSet<>();
        preMay.add(0);

        int currentNum = 1;

        for(int i = 0 ; i < n; i++) {
            int newCurrentNum = currentNum;

            if(coins[i] != newCurrentNum && !preMay.contains(newCurrentNum - coins[i])) {
                return currentNum + 1;
            }

            HashSet<Integer> newMay = new HashSet<>(preMay);
            newMay.add(coins[i]);

            if(coins[i] == currentNum+1) {
                newCurrentNum++;
            }

            for(int preNum : preMay) {
                int newNum = preNum + coins[i];

                if(newNum == newCurrentNum + 1) {
                    newCurrentNum++;
                }
                newMay.add(newNum);
            }

                currentNum = newCurrentNum;
            preMay = newMay;
        }

        return currentNum + 1;

    }


}
