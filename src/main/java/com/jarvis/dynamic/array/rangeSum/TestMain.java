package com.jarvis.dynamic.array.rangeSum;

public class TestMain {
    public static void main(String[] args){
        int[] nums=new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*100);
            System.out.print(nums[i]+"\t");
        }
        System.out.println("区间和"+new RangeSum(nums).sumRange(2,5));
    }
}
