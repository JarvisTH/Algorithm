package com.jarvis.dynamic.fibonacci.rob;

/**
 * 强盗在环形街区抢劫
 */

//bug
public class HouseRobberCircle {
    public int rob(int[] arr){
        if(arr==null||arr.length==0){
            return 0;
        }
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        return Math.max(rob(arr,0,n-2),rob(arr,0,n-1));
    }

    private int rob(int[] arr,int first,int last){
        int pre2=0,pre1=0;
        for(int i=first;i<=last;i++){
            int cur=Math.max(pre1,pre2+arr[i]);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }
}
