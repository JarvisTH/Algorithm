package com.jarvis.dynamic.fibonacci.rob;

/**
 * 抢劫一排住户，但是不能抢邻近的住户，求最大抢劫量。
 *
 * 定义 dp 数组用来存储最大的抢劫量，其中 dp[i] 表示抢到第 i 个住户时的最大抢劫量。
 * 由于不能抢劫邻近住户，如果抢劫了第 i -1 个住户，那么就不能再抢劫第 i 个住户
 */
public class HouseRobber {

    public int rob(int[] arr){
        int pre2=0,pre1=0;
        for(int i=0;i<arr.length;i++){
            int cur=Math.max(pre2+arr[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }
}
