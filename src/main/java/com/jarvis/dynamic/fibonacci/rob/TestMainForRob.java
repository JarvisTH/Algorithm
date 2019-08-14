package com.jarvis.dynamic.fibonacci.rob;

public class TestMainForRob {
    public static void main(String[] args){
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }

        System.out.println("最大抢劫数："+new HouseRobber().rob(arr));
    }
}
