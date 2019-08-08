package com.jarvis.sort.quickSort;

public class TestMainForQuickSort {
    public static void main(String[] args){
        int[] array=new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }

        QuickSort quickSort=new QuickSort(array);
        System.out.println("排序前：");
        quickSort.display();
        System.out.println("排序后：");
        quickSort.quickSort();
    }
}
