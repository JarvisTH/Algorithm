package com.jarvis.sort.mergeSort;

public class TestMainForMerge {
    public static void main(String[] args){
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        MergeSort mergeSort=new MergeSort(array);
        System.out.println("排序前");
        mergeSort.display();
        System.out.println("排序后");
        mergeSort.mergeSort();
    }
}
