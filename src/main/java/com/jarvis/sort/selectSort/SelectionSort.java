package com.jarvis.sort.selectSort;

public class SelectionSort {
    private int[] array;

    /**
     * 构造函数
     * @param array
     */
    public SelectionSort(int[] array){
        this.array=array;
    }

    /**
     * 打印
     */
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
    }

    /**
     * 选择排序
     */
    public void selectionSort(){
        int minIndex; //存储最小元素的下标
        int temp;

        for(int i=0;i<array.length;i++){
            minIndex=i; // 默认第一个元素最小
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;

            System.out.println("第"+(i+1)+"次排序：");
            display();
        }
    }
}
