package com.jarvis.sort.selectSort;

public class TestMainForSelectionSort {
    public static void main(String[] args){
        int[] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
        SelectionSort selectionSort=new SelectionSort(array);
        System.out.println("排序前：");
        selectionSort.display();
        System.out.println("排序后：");
        selectionSort.selectionSort();
    }
}
