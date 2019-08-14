package com.jarvis.sort.insertionSort;

public class InsertionSort {
    private int[] array;

    /**
     *
     * @param array
     */
    public InsertionSort(int[] array){
        this.array=array;
    }

    /**
     *
     */
    public void  display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
    }

    /**
     *
     */
    public void insertionSort(){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int insertPoint=i-1;

            while(insertPoint>=0&&array[insertPoint]>temp){
                array[insertPoint+1]=array[insertPoint];
                insertPoint--;
            }
            array[insertPoint+1]=temp;

            System.out.println("第"+i+"次排序：");
            display();
        }
    }

    /**
     *改进：二分插入排序
     */
    public void binaryInsertionSort() {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            if (array[i - 1] > temp) {
                int insertIndex = binaySearch(0, i - 1, temp);//获取应插入的位置
                for (int j = i; j > insertIndex; j--) { //将有序数组中，插入点之后的元素后移一位
                    array[j] = array[j - 1];
                }

                array[insertIndex] = temp;
            }
            System.out.println("第" + i + "次排序：");
            display();
        }

    }

    /**
     *二分查找
     */
    public int binaySearch(int lowerBound,int upperBound,int target){
        int curIndex;
        while(lowerBound<upperBound){
            curIndex=(lowerBound+upperBound)/2 ;
            if(array[curIndex]>target){
                upperBound=curIndex-1;
            }else {
                lowerBound=curIndex+1;
            }
        }
        return lowerBound;
    }


    /**
     * 2-路插入排序
     * 当L[1]为最小值时，失去优越性，等同于二分插入排序
     */
    public void two_wayInsertionSort(){
        int[] newArray=new int[array.length];
        newArray[0]=array[0];
        int first=0;// 指向最小元素指针
        int last=0;// 指向最大元素指针

        for(int j=0;j<newArray.length;j++){
            System.out.print(newArray[j]+"\t");
        }
        System.out.println();

        for(int i=1;i<array.length;i++){
            if(array[i]>newArray[last]){
                last++;
                newArray[last]=array[i];
            }else if(array[i]<newArray[first]){
                first=(first-1+newArray.length)%newArray.length;
                newArray[first]=array[i];
            }else if(array[i]>=newArray[0]){ //在最大值和最小值之间，且大于等于枢纽值，插入到last之前，需要移动元素
                int curIndex=last;
                last++;
                do{
                    newArray[curIndex+1]=newArray[curIndex];
                    curIndex--;
                }while (newArray[curIndex]>array[i]);

                newArray[curIndex+1]=array[i];
            }else { //在最大值与最小值之间，且小于枢纽值，插入的first之后，需要移动位置
                int curIndex=first;
                first=(first-1+newArray.length)%newArray.length;
                do{
                    newArray[curIndex-1]=newArray[curIndex];
                    curIndex=(curIndex+1+newArray.length)%newArray.length;
                }while (newArray[curIndex]<=array[i]);
                newArray [(curIndex-1+newArray.length)%newArray.length]=array[i];
            }

            for (int j=0;j<newArray.length;j++){
                System.out.print(newArray[j]+"\t");
            }
            System.out.println();
        }
    }
}
