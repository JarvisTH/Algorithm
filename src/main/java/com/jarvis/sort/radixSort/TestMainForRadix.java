package com.jarvis.sort.radixSort;

public class TestMainForRadix {
    public static void main(String[] args){
        int[] array=new int[100];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*1000);
        }

        RadixSort radixSort=new RadixSort(array);
        System.out.println("排序前：");
        radixSort.display();
        System.out.println("排序后：");
        radixSort.radixSort();
    }
}
