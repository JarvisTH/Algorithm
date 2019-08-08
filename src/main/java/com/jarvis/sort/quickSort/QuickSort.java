package com.jarvis.sort.quickSort;

public class QuickSort {
    private int[] array;

    /**
     * 构造函数
     * @param array
     */
    public QuickSort(int[] array){
        this.array=array;
    }

    /**
     * 快排
     */
    public void quickSort(){
        recursiveQuickSort(0,array.length-1);
    }

    /**
     * 递归快排
     * @param left
     * @param right
     */
    public void recursiveQuickSort(int left,int right){
        if(left>=right){
            return;
        }else {
            int pivot=array[left];//参照元素
            int partition=partition(left,right,pivot);
            display();

            recursiveQuickSort(left,partition-1);//对划分后的低段位进行排序
            recursiveQuickSort(partition+1,right);//对划分后的高段位进行排序

        }

    }

    /**
     * 以pivot为基准进行对array进行划分
     * @param left
     * @param right
     * @param pivot
     * @return
     */
    public int partition(int left,int right,int pivot){
        while(left<right){
            while(left<right&&array[right]>=pivot){
                right--;
            }
            swap(left,right);
            while(left<right&&array[left]<=pivot){
                left++;
            }
            swap(left,right);
        }
        return left;
    }

    /**
     * 实现两个元素的位置交换
     * @param left
     * @param right
     */
    public void swap(int left,int right){
        int temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }

    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
