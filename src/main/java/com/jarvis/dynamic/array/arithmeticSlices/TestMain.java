package com.jarvis.dynamic.array.arithmeticSlices;

public class TestMain {
    public static void main(String[] args){
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        System.out.println("个数："+new ArithmeticSlices().numberOfArithmeticSlices(arr));
    }
}
