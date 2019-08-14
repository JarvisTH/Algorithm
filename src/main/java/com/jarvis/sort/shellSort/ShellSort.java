package com.jarvis.sort.shellSort;

public class ShellSort {
    private int[] array;

    public ShellSort(int[] array){
        this.array=array;
    }

    /**
     * 希尔排序
     */
    public void shellSort(){
        int h=1;
        while(3*h+1<array.length){ //确定第一轮排序时的间隔
            h=3*h+1;
        }

        while(h>0){
            for(int i=0;i<h;i++){
                shellInsertSort(i,h); //对间隔为h的元素进行插入排序
            }
            h=(h-1)/3; //下一轮排序间隔
            display();
        }
    }

    /**
     * 希尔排序内部使用插入排序
     * @param beginIndex
     * @param increment
     */
    public void shellInsertSort(int beginIndex,int increment){
        int targetIndex=beginIndex+increment;

        while(targetIndex<array.length){
            int temp=array[targetIndex];

            int previousIndex=targetIndex-increment;
            while(previousIndex>=0&&array[previousIndex]>temp){ //前一个元素大于后一个元素
                array[previousIndex+increment]=array[previousIndex];
                previousIndex=previousIndex-increment;
            }
            array[previousIndex+increment]=temp;//插入到合适的位置

            targetIndex=targetIndex+increment;//插入下一个元素
        }
    }

    /**
     * 打印
     */
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
