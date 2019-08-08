package com.jarvis.sort.insertionSort;

public class TestMainForInsertionSort {
    public static void main(String[] args){
        int[] array=new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }

        InsertionSort insertionSort=new InsertionSort(array);
        System.out.println("排序前：");
        insertionSort.display();
        System.out.println("排序后：");
        insertionSort.binaryInsertionSort();
    }
}
