package com.jarvis.sort.bubbleSort;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array){
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
     * 此时排序效率较差，因为即使完成了排序，也要排序length次
     */
    public void bubbleSort(){
        int temp;
        int length=array.length;

        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(array[j-1]>array[j]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println("第"+(i+1)+"轮排序结果：");
            display();
        }
    }

    public void betterBubbleSort(){
        boolean exchange=false;
        int temp;
        int length=array.length;

        for(int i=0;i<length;i++){
            exchange=false;
            for(int j=1;j<length-i;j++){
                if(array[j-1]>array[j]){
                    exchange=true;
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
            if(!exchange){
                break;
            }
            System.out.println("第"+(i+1)+"轮排序结果：");
            display();
        }
    }
}
