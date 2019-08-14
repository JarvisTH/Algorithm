package com.jarvis.sort.bubbleSort;

public class TestMainForBuubleSort {
    public static void main(String[] args){
        int[] array=new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }

        BubbleSort bubbleSort=new BubbleSort(array);

        System.out.println("排序前：");
        bubbleSort.display();
        System.out.println("排序后：");
        bubbleSort.betterBubbleSort();
    }
}
