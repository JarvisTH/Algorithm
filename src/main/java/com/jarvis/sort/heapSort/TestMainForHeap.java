package com.jarvis.sort.heapSort;


public class TestMainForHeap {
    public static void main(String[] args){
        int[] array=new int[15];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*10);
        }
        HeapSort heapSort=new HeapSort(array);
        System.out.println("排序前：");
        heapSort.printTree(array.length);
        System.out.println("排序后：");
        heapSort.heapSort();
        heapSort.printTree(array.length);
    }
}
