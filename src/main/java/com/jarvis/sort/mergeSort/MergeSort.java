package com.jarvis.sort.mergeSort;

public class MergeSort {
    public int[] array;

    /**
     *构造函数
     * @param array
     */
    public MergeSort(int[] array){
        this.array=array;
    }

    /**
     * 归并排序
     */
    public void mergeSort(){
        int[] workspace=new int[array.length]; //用于辅助排序的数组
        recursiveMergeSort(workspace,0,workspace.length-1);
    }

    /**
     * 递归归并排序
     * @param workSpace
     * @param lowerBound
     * @param uppperBound
     */
    private void recursiveMergeSort(int[] workSpace,int lowerBound,int uppperBound){
        if(lowerBound>=uppperBound){ // 只有一个元素时
            return;
        }else {
            int mid=(uppperBound+lowerBound)/2;
            recursiveMergeSort(workSpace,lowerBound,mid);  // 对低位排序
            recursiveMergeSort(workSpace,mid+1,uppperBound); //对高位排序
            merge(workSpace,lowerBound,mid,uppperBound);
            display();
        }
    }


    //bug
    /**
     * 对数组array的两段进行合并
     * @param workSpace
     * @param lowerBound
     * @param mid
     * @param upperBound
     */
    public void merge(int[] workSpace,int lowerBound,int mid,int upperBound){
        int lowBegin=lowerBound; //低位段的起使下标
        int loeEnd=mid; //低位段的结束下标
        int highBegin=mid+1;
        int highEnd=upperBound;
        int j=0; //workSpace的下标指针
        int n=upperBound-lowerBound+1; //归并的元素总数

        while(lowBegin<=loeEnd&&highBegin<=highEnd){
            if(array[lowBegin]<array[highBegin]){ //将两者较小的那个放入workSpace
                workSpace[j++]=array[lowBegin++];
            }else {
                workSpace[j++]=array[highBegin++];
            }

            while(lowBegin<=loeEnd){
                workSpace[j++]=array[lowBegin++];
            }
            while(highBegin<=highEnd){
                workSpace[j++]=array[highBegin++];
            }

            for(j=0;j<n;j++){ //将归并好的元素复制到array中
                array[lowerBound++]=workSpace[j];
            }
        }
    }

    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }


}
